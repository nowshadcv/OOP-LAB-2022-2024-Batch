package labcycle;

public class CPUDetails {
	public static void main(String[] args) {
		CPU cpu = new CPU() ;
		CPU.Processor Processor = cpu.new Processor() ;
		CPU.RAM ram = new CPU.RAM();
		System.out.println("Processor Cache = " + Processor.getCache() ) ;
		System.out.println("RAM Clock Speed = " + ram.getClockSpeed() ) ;}
	}


