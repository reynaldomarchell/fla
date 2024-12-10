package model;

import java.util.Random;

public abstract class Worker {
	private String name;
	private int age;
	protected Random random = new Random();
	
	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getUp() {
		System.out.println(name + " is waking up");
	}
	
	public void goToWork() {
		System.out.println(name + " is going to work");
	}
	
	public abstract void work();
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public abstract void viewEarning();
	
	public void dailyRoutine() {
		getUp();
		goToWork();
		work();
		sleep();
		viewEarning();
	}
	
}
