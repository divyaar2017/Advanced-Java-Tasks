package divya.advancedjavaconcepts;

class OuterClassD{
	
	class InnerClass{
		
		public void printSomething() {
			
			System.out.println("Print from inner class");
		}
	}
}

public class NonStaticNestedClass {
	
	public static void main(String args[]) {
	
	OuterClassD outer = new OuterClassD();
	
	OuterClassD.InnerClass inner = outer.new InnerClass();

	inner.printSomething();
	
	}

}
