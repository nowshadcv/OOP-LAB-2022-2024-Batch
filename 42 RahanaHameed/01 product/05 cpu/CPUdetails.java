package rahana;

import rahana.CPU.Processor;

public class CPUdetails {

	public static void main(String[] args) {
	CPU	cpu=new CPU();
	CPU.Processor=cpu.new Processor();
	CPU.RAM ram=new CPU.RAM();
	System.out.println("processor cache="+Processor.getcache());
	System.out.println("RAM clock speed="+ ram.getClockSpeed());

	}

}
