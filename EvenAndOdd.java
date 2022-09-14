package divya.advancedjavaconcepts;

public class EvenAndOdd {
	
	public static void main(String args[]) {

		int[] numbers = {1,2,3,4,5,6,7,8,9,10};

		for (int i=0; i<10 ; i++) {
		  
		   if (numbers[i] % 2 == 0 ) {
		       System.out.println( numbers[i] + " is even number");
		                   
		  } else
		      { System.out.println(numbers[i] + " is odd number"); 
		}
		   
	}
	
}
}