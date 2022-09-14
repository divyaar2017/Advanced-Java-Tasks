package divya.advancedjavaconcepts;

class OuterClassA{
	
	public void outerMethod() {
		
		class InnerClass{
		
			public void printSomething() {
			
			System.out.println("Method Inner class printSomething ");			
		    }
		
			public void sum(int a, int b) {
				
				int sum = a+b;
				System.out.println("Sum of A and B : " + sum);
			}
						
	}
		
		InnerClass inner = new InnerClass();
		inner.printSomething();
		inner.sum(10,20);		
  }
	
}

public class MethodLocalNestedClass {
	
	public static void main(String args[]) {
		
		OuterClassA outer = new OuterClassA();
		outer.outerMethod();
		
	}

}
