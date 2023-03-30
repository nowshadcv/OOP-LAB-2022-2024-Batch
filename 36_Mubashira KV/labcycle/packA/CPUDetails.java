package packA;


public class CPUDetails {

	public static void main(String[]args) {
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("processor Cache="+processor.getCache());
		
     	System.out.println("RAM ClockSpeed="+ram.getClockSpeed());
	        }
       
}
