package exercise13;

import java.util.Optional;

public class PayRollApp {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Employee defaultEmp = new Employee(-1);	
		Optional<Employee> opt = dao.findEmployeeById(10);
		
		Employee e = opt.orElse(defaultEmp);
			
		
		if (e.getId() == 1) {
				System.out.println("Something ....");
			} 
		
		

	}

}
