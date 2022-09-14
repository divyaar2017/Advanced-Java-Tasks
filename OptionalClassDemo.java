package divya.advancedjavaconcepts;

import java.util.Optional;

public class OptionalClassDemo {

	public Integer SumOfNumbers(Optional<Integer> a, Optional<Integer> b) {
		
		System.out.println("1st Parameter is : " + a.isPresent());
		System.out.println("2nd Parameter is : " + b.isPresent());
		
		@SuppressWarnings("removal")
		Integer parm1 =  a.orElse(new Integer(15));
		@SuppressWarnings("removal")
		Integer parm2 = b.orElse(new Integer(55));
		
		return parm1+parm2;
	}
	
	public Integer DiffOfNumbers(Optional<Integer> a, Optional<Integer> b) {

		@SuppressWarnings("removal")
		Integer parm1 = a.orElse(new Integer(10));
		Integer parm2 = b.get();
		return parm1-parm2;
		
	}
	
	public static void main(String args[]) {
		
		OptionalClassDemo demo = new OptionalClassDemo();
		String[] line = new String[30];
	    String line1 = "ABCDEFGH";

		String word1 = line1.toLowerCase();
		System.out.println(word1);
		
		Optional<String> pasWord = Optional.ofNullable(line[8]);
		
		
		if(pasWord.isEmpty()) {
			System.out.println("isEmpty function - Line is Null");
		} else {
		String word = line[8].toLowerCase();
		System.out.println("isEmpty function - " + word);
		}
		
		if(pasWord.isPresent()) {
			String word = line[8].toLowerCase();
			System.out.println("isPresent function - " + word);
			
		} else {
			
			System.out.println("isPresent function - Line is null");
		}
        
		
		
		Integer val1 = null;
		@SuppressWarnings("removal")
		Integer val2 = new Integer(50);
		//System.out.println(val1+val2);
		
		Optional<Integer> a = Optional.ofNullable(val1);
		Optional<Integer> b = Optional.ofNullable(val2);
		
		int sum = demo.SumOfNumbers(a,b);
		int diff = demo.DiffOfNumbers(a,b);
		
		System.out.println("Sum of numbers : " + sum);
		System.out.println("Difference of numbers : " + diff);
		
	}
}
