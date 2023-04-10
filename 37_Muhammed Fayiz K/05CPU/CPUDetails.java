package pgm5;

import pgm5.CPU.Processor;

public class CPUDetails{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = new CPU.RAM();
		System.out.println("processor cache = "+processor.getCache());
		System.out.println("RAM clock speed = "+ram.getClockSpeed());}}