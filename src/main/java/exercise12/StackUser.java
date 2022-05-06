package exercise12;

public class StackUser {
	
	public void fill(Stack s) {
		for(int i = 0 ; i < 11 ; i++) {
			try {
				s.push(i);
				System.out.println("Pushed --->"+i);
			} catch (StackFullException e) {
				
				e.printStackTrace();
			}
		}
	}

}
