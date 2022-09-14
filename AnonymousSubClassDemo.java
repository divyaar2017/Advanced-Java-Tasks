package divya.advancedjavaconcepts;

class OuterDemo{
	
      void printDemo() {
    	  
    	  System.out.println("Outer class print demo method");
      }
      
      void printSum(int a, int b) {
    	  
      }
   }

public class AnonymousSubClassDemo {
	
	static OuterDemo outer = new OuterDemo() {
		
		void printDemo() {
			
			System.out.println("Anonymous class print demo method");
		}
		
		void printSum(int a, int b) {
	    	  
	    	  System.out.println("Anonymous class A+B = "+ (a+b));
	      }

	};
	
	public static void main(String args[]) {
		
		outer.printDemo(); 
		outer.printSum(2, 3);	
		
	}
}


