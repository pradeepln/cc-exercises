package exercise04;

public class LendingSystem {
	
	public boolean processLoanRequest(LoanRequest loanRequest) {
		if(loanRequest.getApplicantName() == null || loanRequest.getType() == null) {
			System.out.println("applicant name and applicant type are needed parameters");
			return false;
		}
		if(!loanRequest.getType().equalsIgnoreCase("government") && loanRequest.getCibilScore() <= 0) {
			System.out.println("For all applicant types other than government, cibil score is needed");
			return false;
		}
		
		//ACTUAL LOGIC HERE, elided for simplicity
		
		return true;
	}

}
