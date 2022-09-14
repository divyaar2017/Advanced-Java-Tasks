package divya.advancedjavaconcepts;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionDemo1 {
	
	public static void main(String args[]) {
		
		List<String> al = new ArrayList<String>();
		
		al.add("Adhvik");
		al.add("Prabhu");
		al.add("Divya");
		
		al.forEach((name)->System.out.println(name));
	
	}

}
