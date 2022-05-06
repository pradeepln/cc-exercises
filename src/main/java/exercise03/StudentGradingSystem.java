package exercise03;

//https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
//DRY
public class StudentGradingSystem {

	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	private static final int MIN_MARKS_FOR_FIRST_CLASS = 180;

	
	public static void main(String[] args) {

		Student s1 = new Student(41, 41, 41, "Ram");
		Student s2 = new Student(74, 69, 39, "Sham");

		StudentGradingSystem sgs = new StudentGradingSystem();
		sgs.gradeStudents(s1, s2);
	}
	
	public void gradeStudents(Student...students) {
		for(Student s : students) {
			Grade grade = gradeAStudent(s);
			String displayText = encodeDisplayText(s, grade);
			System.out.println(displayText);
		}
		
	}

	Grade gradeAStudent(Student aStudent) {
		if(isPassed(aStudent)) {
			if(getTotal(aStudent) < MIN_MARKS_FOR_FIRST_CLASS)
			{
				return Grade.PASS;
			} else {
				return Grade.FIRST;
			}
		}else {
			return Grade.FAIL;
		}
		
	}

	int getTotal(Student aStudent) {
		return aStudent.getPhysicsMarks() + aStudent.getChemistryMarks() + aStudent.getMathsMarks();
	}

	boolean isPassed(Student aStudent) {
		return aStudent.getPhysicsMarks() >= 40 && aStudent.getChemistryMarks() >= 40 && aStudent.getMathsMarks() >= 40;
	}

	private String encodeDisplayText(Student aStudent, Grade grade) {
		String encodedDisplayText = null;
		switch (grade) {
		case FAIL :
			encodedDisplayText = ANSI_RED_BACKGROUND+"Student with name "+aStudent.getName()+" fails!"+ANSI_RESET;
			break;
		case PASS :
			encodedDisplayText = ANSI_YELLOW_BACKGROUND+"Student with name "+aStudent.getName()+" just pass"+ANSI_RESET;
			break;
		case FIRST :
			encodedDisplayText = ANSI_GREEN_BACKGROUND+"Student with name "+aStudent.getName()+" first class"+ANSI_RESET;
		}
		return encodedDisplayText;
	}

	

}
