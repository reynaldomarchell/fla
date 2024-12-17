package state;

import student.Student;

public class BasicDesign implements State{
	
	@Override
	public void nextState(Student student) {
		student.setCurrState(new AdvancedDesign());
	}
	
	@Override
	public String toString() {
		return "Basic Design";
	}

}
