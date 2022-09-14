package divya.advancedjavaconcepts;

public class MultiThreadingDemo1 extends Thread {

	public void run() {
		
		for(int i = 0; i<=5 ; i++) {
			System.out.println("This is run method");
		}
	}
	
	public static void main(String args[]) {
		
		MultiThreadingDemo1 t1 = new MultiThreadingDemo1();
		t1.start();
		
		for(int i = 0; i<=5 ; i++) {
			System.out.println("This is main method");
		}
		
	}
}
