package exercise04;

import java.util.ArrayList;
import java.util.List;

public class Temp {

	
	static void myAlgo(List l) {
		l.add("abc");
		//......
		l.remove("xyz");
	}
	
	
	public static void main(String[] args) {
		List ll = new ArrayList<>();

		myAlgo(ll);
	}

}
