package divya.advancedjavaconcepts;

interface OuterDemoC{
	
	public void printDemo();
	public void printSum(int a, int b);
	
}

public class AnonymousInterfaceImplementation {
	
	static OuterDemoC outer = new OuterDemoC() {
		
		public void printDemo() {
			
		System.out.println("Anonymous class printDemo method");
		}
		
		public void printSum(int a, int b) {
	    	  
	    	  System.out.println("Anonymous class A+B = "+ (a+b));
	      }
	};
	
	public static void main(String args[]) {
		
		outer.printDemo();
		outer.printSum(4,5);
		
	}

}
