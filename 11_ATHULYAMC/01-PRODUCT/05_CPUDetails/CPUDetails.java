package athulyamc;

public class CPUDetails {

	public static void main(String[] args) {
		CPU cpu= new CPU();
		CPU.processor processor=cpu.new processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("Processor cache="+processor.getcache());
		System.out.println("RAM Clock speed="+ ram.getClockSpeed());
		
		

	}

}
