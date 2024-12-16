package model;

public class IceCream {
	private String name, type, flavor;
	
	public IceCream(String name, String type, String flavor) {
		super();
		this.name = name;
		this.type = type;
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	
	

}
