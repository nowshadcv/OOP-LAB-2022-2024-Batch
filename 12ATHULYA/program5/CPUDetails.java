package program5;
public class CPUDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram = new CPU.RAM();
		System.out.println("Processor Cache="+processor.getCache());
		System.out.println("RAM Clock Speed ="+ram.getClockSpeed());

	}

}
