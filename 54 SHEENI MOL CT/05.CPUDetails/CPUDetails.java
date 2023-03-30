package packS;

public class CPUDetails {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.processor processor=cpu.new processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("processor cache="+processor.getCache());
		System.out.println("RAM clock speed="+ram.getClockSpeed());
		

	}

}
