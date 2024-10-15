package main;

public class Computer {
	private String motherboard;
	private String processor;
	private String ram;
	private String power_supply;
	private String hard_disk;
	
	private boolean haveGPU;
	private boolean haveSSD;
	private boolean haveWirelessReceiver;
	
	public Computer(String motherboard, String processor, String ram, String power_supply, String hard_disk) {
		super();
		this.motherboard = motherboard;
		this.processor = processor;
		this.ram = ram;
		this.power_supply = power_supply;
		this.hard_disk = hard_disk;
	}

	public Computer(String motherboard, String processor, String ram, String power_supply, String hard_disk,
			boolean haveGPU) {
		super();
		this.motherboard = motherboard;
		this.processor = processor;
		this.ram = ram;
		this.power_supply = power_supply;
		this.hard_disk = hard_disk;
		this.haveGPU = haveGPU;
	}

	public Computer(String motherboard, String processor, String ram, String power_supply, String hard_disk,
			boolean haveGPU, boolean haveSSD, boolean haveWirelessReceiver) {
		super();
		this.motherboard = motherboard;
		this.processor = processor;
		this.ram = ram;
		this.power_supply = power_supply;
		this.hard_disk = hard_disk;
		this.haveGPU = haveGPU;
		this.haveSSD = haveSSD;
		this.haveWirelessReceiver = haveWirelessReceiver;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getPower_supply() {
		return power_supply;
	}

	public void setPower_supply(String power_supply) {
		this.power_supply = power_supply;
	}

	public String getHard_disk() {
		return hard_disk;
	}

	public void setHard_disk(String hard_disk) {
		this.hard_disk = hard_disk;
	}

	public boolean isHaveGPU() {
		return haveGPU;
	}

	public void setHaveGPU(boolean haveGPU) {
		this.haveGPU = haveGPU;
	}

	public boolean isHaveSSD() {
		return haveSSD;
	}

	public void setHaveSSD(boolean haveSSD) {
		this.haveSSD = haveSSD;
	}

	public boolean isHaveWirelessReceiver() {
		return haveWirelessReceiver;
	}

	public void setHaveWirelessReceiver(boolean haveWirelessReceiver) {
		this.haveWirelessReceiver = haveWirelessReceiver;
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
