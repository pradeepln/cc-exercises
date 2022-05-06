package exercise05;

//https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
//DRY
public class StudentGradingSystem {

	
	private static final int MIN_MARKS_FOR_FIRST_CLASS = 180;
	
	GradingPrinter printer = new GradingPrinter();
	
	public static void main(String[] args) {

		Student s1 = new Student(41, 41, 41, "Ram");
		Student s2 = new Student(74, 69, 39, "Sham");

		StudentGradingSystem sgs = new StudentGradingSystem();
		sgs.gradeStudents(s1, s2);
	}
	
	public void gradeStudents(Student...students) {
		for(Student s : students) {
			Grade grade = gradeAStudent(s);
			printer.printGrade(s, grade);
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

	

	

}
