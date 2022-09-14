package divya.advancedjavaconcepts;

class OuterA{
	
	static class InnerB{ // need not create any object for this static inner class
		
		public void m1() {
			
			System.out.println("Static nested Inner class");
		}
		
		public void m2(int a,int b) {
		
			int Sum = a+b;
			System.out.println("Sum of A and B : " + Sum);

		}
	}
}

public class StaticNestedClass {
	
	public static void main(String args[]) {
		
		OuterA.InnerB inner = new OuterA.InnerB();
		inner.m1();
		inner.m2(10,20);
		
	}
	
	

}