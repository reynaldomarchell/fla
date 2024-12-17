package student;

import state.BasicDesign;
import state.BasicProgramming;
import state.State;

public class Student {
	private String id;
	private String name;
	private Integer age;
	private String selectedCourse;
	private State currState;
	
	public Student(String id, String name, Integer age, String course) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.selectedCourse = course;
		
		if(selectedCourse.equals("Programming"))
			this.currState = new BasicProgramming();
		else if(selectedCourse.equals("Design"))
			this.currState = new BasicDesign();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSelectedCourse() {
		return selectedCourse;
	}
	public void setSelectedCourse(String selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
	public State getCurrState() {
		return currState;
	}
	public void setCurrState(State currState) {
		this.currState = currState;
	}
	
	
	
}
