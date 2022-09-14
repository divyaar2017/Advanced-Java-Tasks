package divya.advancedjavaconcepts;

class ComputerClass{ //“Illegal modifier for the class your_class_name; only public, abstract & final are permitted”.
	
	double price = 7.9;
	
	class Processor {
		
		double price = 3.2;

		public void getCache(){
			
			double price = 1.2;
			System.out.println("getCache method from Processor inner class");
			System.out.println("Price from Processor class getCache method - " + price);
			System.out.println("OuterClass-ComputerClass price from Processor class - " + ComputerClass.this.price);
			//System.out.println("Price from Processor class getCache method" + InnerProcessor.this.price);
		}
		
        class InnerProcessor{
			
			double price = 8.5;
			
			public void getCache() {
				
				System.out.println("getCache method from InnerProcessor inner class ");
				System.out.println("Price from InnerProcessor class getCache method - " + price);
				System.out.println("OuterClass - ComputerClass price from Innerprocessor class - " + ComputerClass.this.price);
				System.out.println("OuterClass- Processor price from Innerprocessor class - " + Processor.this.price);
			}	
		}	
	}
	
	class RAM {
		
		class InnerRam{
			
			public void getClockSpeed() {
				System.out.println("getClockSpeed method from InnerRAM inner class");
			}
			
		}
		
		public void getClockSpeed() {
			System.out.println("getClockSpeed method from RAM inner class");
		}
	}
}

public class ComputerInnerClassDemo {
	
	public static void main(String args[]) {
		
		ComputerClass computer = new ComputerClass();
		
		ComputerClass.Processor processor = computer.new Processor();
	
		ComputerClass.Processor.InnerProcessor innerProcessor = processor.new InnerProcessor();
		
		processor.getCache();
		innerProcessor.getCache();
		
		ComputerClass.RAM ram = computer.new RAM();
		
		ComputerClass.RAM.InnerRam innerRam = ram.new InnerRam();
		
		ram.getClockSpeed();
		
		innerRam.getClockSpeed();
	
		
	}

}
