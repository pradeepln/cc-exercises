package exercise03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentGradingSystemTest {

	@Test
	void test() {
		StudentGradingSystem obj = new StudentGradingSystem();
		Student s1 = new Student(100, 45, 65, "test");
		obj.gradeStudents(s1, s1);
	}

}
