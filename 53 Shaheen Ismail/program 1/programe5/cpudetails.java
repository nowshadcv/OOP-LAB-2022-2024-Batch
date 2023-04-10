package programe5;

public class cpudetails {

	public static void main(String[] args) {
		cpu cpu = new cpu();
		cpu.processor processor = cpu.new processor();
	    cpu.RAM ram = new cpu.RAM();
		System.out.println("Processor Cache "+processor.getCach());
		System.out.println("RAM Clock Speed = "+ram.getClockSpeed());
		

	}

}

