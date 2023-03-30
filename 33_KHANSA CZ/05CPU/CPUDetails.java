package packA;

import packA.CPU.processor;

public class CPUDetails {

	public static void main(String[] args) {
		CPU cpu=new CPU();
		CPU.processor processor=cpu.new processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("Processor Cache="+processor.getCache());
		System.out.println("RAM Clock Speed="+ram.getClockSpeed());
		// TODO Auto-generated method stub

	}

}
