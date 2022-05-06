package exercise14;



public class ServiceLayer {
	Alerter alerter = new JavaMailAlerter();
	
	DataAccessLayer dal = new DataAccessLayer();
	
	public void someBusinessOperation() {
		if(checkSomeBusinessRule()) {
			dal.storeDataInDB();
		}else {
			alerter.sendAlert("Warning: May need your attention", "business rule 1 keeps failing for no apparent reason");
		}
	}

	private boolean checkSomeBusinessRule() {
		//some actual logic here
		return false;
	}

}
