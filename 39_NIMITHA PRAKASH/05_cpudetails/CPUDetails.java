package packA;

import packA.cpu.RAM;

public class CPUDetails {
	public static void main(String[] args) {
		cpu CPU=new cpu();
		cpu.processor processor=CPU.new processor();
		cpu.RAM ram=new cpu.RAM();
		System.out.println("processor cache="+processor.getCache());
		System.out.println("RAM clock speed=" +ram.getClockSpeed());
	
	}
}
