package divya.advancedjavaconcepts;

public class MultiThreadingDemo3 extends Thread {
	
	public void run() {
		
		for (int i=0; i<=5 ; i++) {
			
			System.out.println("Run method thread execution i : " + i);
			
			try {
				
				Thread.sleep(100);
				System.out.println("Try block thread execution i : " + i);
			}
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	public static void mian(String args[]) {
		
		MultiThreadingDemo3 t1 = new MultiThreadingDemo3();
		MultiThreadingDemo3 t2 = new MultiThreadingDemo3();
		t1.start();
		t2.start();
		
		for(int i = 0; i<=5 ; i++) {
			System.out.println("This is main method");
		}
		

}

	
}
