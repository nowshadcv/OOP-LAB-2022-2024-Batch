package packA;

public class cpuDetails {
	public static void main(String[]args) {
		cpu cpu=new cpu();
		cpu.processor processor=cpu.new processor();
		cpu.RAM RAM=new cpu.RAM();
		System.out.println("Processor Cache="+processor.getCache());
		System.out.println("RAM clock speed="+RAM.getClockSpeed());
	}

}
