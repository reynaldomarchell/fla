package models;

public abstract class Burger {
	private String ingredients;
	private String name;
	private Integer price;
	
	public Burger(String ingredients, String name, Integer price) {
		super();
		this.ingredients = ingredients;
		this.name = name;
		this.price = price;
	}
	
	public abstract void makeBurger();

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
}
