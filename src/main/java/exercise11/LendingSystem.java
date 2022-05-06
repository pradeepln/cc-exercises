package exercise11;

public class LendingSystem {
	
	public boolean processLoanRequest(String applicantName, String address,	String purposeOfLoan, String specialRequests, String type, int cibilScore, int requiredTerm) {
		if(applicantName == null || type == null) {
			throw new IllegalArgumentException("applicant name and applicant type are needed parameters");
		}
		if(!type.equalsIgnoreCase("government") && cibilScore <= 0) {
			throw new IllegalArgumentException("For all applicant types other than government, cibil score is needed");
		}
		
		//ACTUAL LOGIC HERE, elided for simplicity
		
		return true;
	}

}
