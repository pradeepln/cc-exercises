package exercise04;

public class LoanRequest {
	private String applicantName;
	private String address;
	private String purposeOfLoan;
	private String specialRequests;
	private String type;
	private int cibilScore;
	private int requiredTerm;

	private LoanRequest(LoanRequestBuilder b) {
		this.applicantName = b.applicantName;
		this.address = b.address;
		this.purposeOfLoan = b.purposeOfLoan;
		this.specialRequests = b.specialRequests;
		this.type = b.type;
		this.cibilScore = b.cibilScore;
		this.requiredTerm = b.requiredTerm;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public String getAddress() {
		return address;
	}

	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}

	public String getSpecialRequests() {
		return specialRequests;
	}

	public String getType() {
		return type;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public int getRequiredTerm() {
		return requiredTerm;
	}
	
	public static LoanRequestBuilder startBuilding() {
		return new LoanRequestBuilder();
	}
	
	//__________________________ builder follows _________________
	
	public static class LoanRequestBuilder {

		private String applicantName;
		private String address;
		private String purposeOfLoan;
		private String specialRequests;
		private String type;
		private int cibilScore;
		private int requiredTerm;
		
		
		public LoanRequestBuilder applicantName(String applicantName) {
			this.applicantName = applicantName;
			return this;
		}
		public LoanRequestBuilder address(String address) {
			this.address = address;
			return this;
		}
		public LoanRequestBuilder purposeOfLoan(String purposeOfLoan) {
			this.purposeOfLoan = purposeOfLoan;
			return this;
		}
		public LoanRequestBuilder specialRequests(String specialRequests) {
			this.specialRequests = specialRequests;
			return this;
		}
		public LoanRequestBuilder type(String type) {
			this.type = type;
			return this;
		}
		public LoanRequestBuilder cibilScore(int cibilScore) {
			this.cibilScore = cibilScore;
			return this;
		}
		public LoanRequestBuilder requiredTerm(int requiredTerm) {
			this.requiredTerm = requiredTerm;
			return this;
		}
		
		public LoanRequest build() {
			return new LoanRequest(this);
		}
		
	}
}