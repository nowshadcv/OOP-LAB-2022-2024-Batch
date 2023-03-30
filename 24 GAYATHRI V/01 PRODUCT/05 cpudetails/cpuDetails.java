package gayathri;

public class cpuDetails {

	public static void main(String[] args) {
		cpu cpu=new cpu();
		cpu.processor processor= cpu.new processor();
		cpu.Ram ram = new cpu.Ram();
		System.out.println("processor cache=" + processor.getcache());
		System.out.println("ram clock speed=" + ram.getClockSpeed());
		// TODO Auto-generated method stub

	}

}
