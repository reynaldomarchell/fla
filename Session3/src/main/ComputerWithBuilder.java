package main;

public class ComputerWithBuilder {
	private String motherboard;
	private String processor;
	private String ram;
	private String power_supply;
	private String hard_disk;
	
	private boolean haveGPU;
	private boolean haveSSD;
	private boolean haveWirelessReceiver;
	
	public ComputerWithBuilder(ComputerBuilder computerBuilder) {
		this.motherboard = computerBuilder.motherboard;
		this.processor = computerBuilder.processor;
		this.ram = computerBuilder.ram;
		this.power_supply = computerBuilder.power_supply;
		this.hard_disk = computerBuilder.hard_disk;
		this.haveGPU = computerBuilder.haveGPU;
		this.haveSSD = computerBuilder.haveSSD;
		this.haveWirelessReceiver = computerBuilder.haveWirelessReceiver;
	}
	
	public static class ComputerBuilder {
		private String motherboard;
		private String processor;
		private String ram;
		private String power_supply;
		private String hard_disk;
		
		private boolean haveGPU;
		private boolean haveSSD;
		private boolean haveWirelessReceiver;
		
		public ComputerBuilder(String motherboard, String processor, String ram, String power_supply, String hard_disk) {
			this.motherboard = motherboard;
			this.processor = processor;
			this.ram = ram;
			this.power_supply = power_supply;
			this.hard_disk = hard_disk;
		}
		
		public ComputerBuilder enableGPU() {
			this.haveGPU = true;
			
			return this;
		}
		
		public ComputerBuilder enableSSD() {
			this.haveSSD = true;
			
			return this;
		}
		
		public ComputerBuilder enableReceiver() {
			this.haveWirelessReceiver = true;
			
			return this;
		}
		
		
		public ComputerWithBuilder build() {
			return new ComputerWithBuilder(this);
		}
	}
	
	public void printComputer() {
		System.out.println("Motherboard :" + motherboard);
		System.out.println("Processor :" + processor);
		System.out.println("RAM :" + ram);
		System.out.println("Power Supply :" + power_supply);
		System.out.println("Hard Disk :" + hard_disk);
		
		if(haveGPU) {
			System.out.println("Have GPU");
		}
		if(haveSSD) {
			System.out.println("Have SSD");
		}
		if(haveWirelessReceiver) {
			System.out.println("Have Wireless Receiver");
		}
	}

}
