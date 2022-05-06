package exercise13;

import java.util.Optional;

public class EmployeeDAO {

	public  Optional<Employee> findEmployeeById(int id) {
		// db query select * from employee where emp_id=id
		boolean found = false;
		if(found) {
			return Optional.of(new Employee(id));
		}else {
			return Optional.empty();
		}
	}
}
