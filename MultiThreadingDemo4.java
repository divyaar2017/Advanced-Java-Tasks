package divya.advancedjavaconcepts;

public class MultiThreadingDemo4 extends Thread {
	
	public void run() {
		
		for (int i=0;i<5;i++) {
		try {
			
			
			System.out.println("Try block thread execution i : " + i);
			Thread.sleep(300);
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

  }
	
	public static void main(String args[]) throws InterruptedException {
		MultiThreadingDemo4 t1 = new MultiThreadingDemo4();
		t1.start();
		t1.join(300);
		
		
		for (int i=0;i<5;i++) {
			System.out.println("This is main method");
		}
		
	}
}
