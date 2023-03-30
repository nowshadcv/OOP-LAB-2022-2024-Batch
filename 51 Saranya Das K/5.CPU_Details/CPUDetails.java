package packA;

public class CPUDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();
		CPU.processor processor=cpu.new processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("processor cache="+processor.getCatche());
		System.out.println("RAM clock speed="+ram.getClockspeed());
		

	}

}