package divya.advancedjavaconcepts;

interface Calculation{
	
	public void simpleInterest();

}

public class LambaExpressionDemo {
	
	public static void main(String args[]) {
	
	int principal = 10000;
	int years = 2;
	int rate = 10;
	int SI = (principal*years*rate)/100;

	Calculation c = () -> {
		System.out.println("Simple Interest : " + SI);
	};

    c.simpleInterest();
}
}

