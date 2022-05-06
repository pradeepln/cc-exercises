package exercise05;
import static exercise05.AnsiEncoder.*;
public class GradingPrinter {
	
	public void printGrade(Student aStudent, Grade grade) {
		String displayText = encodeDisplayText(aStudent, grade);
		System.out.println(displayText);
	}
	
	public String encodeDisplayText(Student aStudent, Grade grade) {
		String encodedDisplayText = null;
		switch (grade) {
		case FAIL :
			encodedDisplayText = withReset(withRedBG("Student with name "+aStudent.getName()+" fails!"));
			break;
		case PASS :
			encodedDisplayText = withReset(withYellowBG("Student with name "+aStudent.getName()+" just pass"));
			break;
		case FIRST :
			encodedDisplayText =withReset(withGreenBG("Student with name "+aStudent.getName()+" first class"));
		}
		return encodedDisplayText;
	}

}
