package exercise08;

public class HPPrinter  extends Printer{
	

	@Override
	public void on() {
		super.on();
		int inputVolts = 251;
		if(inputVolts < 150 || inputVolts > 250) {
			System.out.println("Can't print when input voltage is "+inputVolts);
			//throw exc
		}
	}
	
	@Override
	public void print(String path) {
		
		//actual logic for printing
	}

}
