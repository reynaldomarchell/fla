package model;

import state.ChefIdleState;
import state.State;

public class Chef {
	private String chefName;
	private int age;
	private State state;
	
	public Chef(String chefName, int age) {
		super();
		this.chefName = chefName;
		this.age = age;
		this.state = new ChefIdleState(this);
	}
	
	public String getChefName() {
		return chefName;
	}
	public void setChefName(String chefName) {
		this.chefName = chefName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
}
