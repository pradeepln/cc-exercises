package exercise11;

public class LendingApp {

	public static void main(String[] args) {
		LendingSystem ls = new LendingSystem();
		
		try {
			boolean loanApproved = ls.processLoanRequest("pradeep", null, null, null, null, 700, 60);
			if(loanApproved) {
				System.out.println("success!!");
				//some logic
			}else{
				System.out.println("rejected!!");
				//logic
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
