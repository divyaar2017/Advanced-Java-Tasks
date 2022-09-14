package divya.advancedjavaconcepts;

public class MultiThreadingDemo2 implements Runnable {
	
	public void run() {
		for (int i=0;i<5;i++) {
			try {

				Thread.sleep(1000);
				System.out.println("Run Method thread is " +Thread.currentThread().getName());
			}
			catch(InterruptedException e) {
				
				e.printStackTrace();
			}
	}

}
	
	public static void main(String args[]) {
		
		MultiThreadingDemo2 rd1 = new MultiThreadingDemo2();
		Thread t1 = new Thread(rd1);
		Thread t2 = new Thread(rd1);
		Thread t3 = new Thread(rd1);
		//t1.setName("ThreadT1");
		
		t1.start();
		
		
		
		try {
			System.out.println("Thread name from main method is " + Thread.currentThread().getName());
			t1.join();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			System.out.println("Thread name from main method is " + Thread.currentThread().getName());
			t2.join();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		t3.start();
		
		try {
			System.out.println("Thread name from main method is " + Thread.currentThread().getName());
			t3.join();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

