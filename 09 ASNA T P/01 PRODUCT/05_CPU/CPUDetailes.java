package PackA;

public class CPUDetailes {

	public static void main(String[] args) {
		  CPU cpu = new CPU() ;
		  CPU.processor processor = cpu.new processor() ;
		  CPU.Ram ram = new CPU.Ram() ;
		  System.out.println("Processor Cache =" + processor.getCache() ) ;
		  System.out.println("RAM Clock speed =" + ram.getClockspeed() );}}
		  

	


