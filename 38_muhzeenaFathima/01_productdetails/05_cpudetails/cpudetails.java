package packA;

public class cpudetails {

	public static void main(String[] args) {
		cpu cpu=new cpu();
		cpu.Processor processor = cpu.new Processor() ;
		cpu.RAM ram=new cpu.RAM();
		System.out.println("Processor Cache="+ processor.getCache());
		System.out.println("RAM Clock speed="+ ram.getClockSpeed());

	}

}
