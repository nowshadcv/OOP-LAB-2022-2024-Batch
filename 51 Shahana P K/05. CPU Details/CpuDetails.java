package packA;

public class CpuDetails {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.processor processor = cpu.new processor();
		CPU.RAM ram = new CPU.RAM();
		System.out.println("Processor Cache "+processor.getCach());
		System.out.println("RAM Clock Speed = "+ram.getClockSpeed());
		

	}

}
