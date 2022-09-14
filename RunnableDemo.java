package divya.advancedjavaconcepts;

public class RunnableDemo implements Runnable {
	
		public void run() {
			
			for(int i = 0; i<=5 ; i++) {
				System.out.println("This is run method");
			}
		}
		
		public static void main(String args[]) {
			
			RunnableDemo rn = new RunnableDemo();
			Thread t = new Thread(rn);
			t.start();
			
			for(int i = 0; i<=5 ; i++) {
				System.out.println("This is main method");
			}
	
	}

}
