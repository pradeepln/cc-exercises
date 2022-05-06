package exercise04;

public class Client {

	public static void main(String[] args) {
		LendingSystem ls = new LendingSystem();

		
		LoanRequest lr = LoanRequest
						.startBuilding()
						.applicantName("pradeep")
						.cibilScore(800)
						.type("induvidual")
						.build();

		boolean approval = ls.processLoanRequest(lr);
	}

}
