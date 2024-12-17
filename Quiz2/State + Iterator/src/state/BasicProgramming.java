package state;

import student.Student;

public class BasicProgramming implements State{
	
	@Override
	public void nextState(Student student) {
		student.setCurrState(new AdvancedProgramming());
	}
	
	@Override
	public String toString() {
		return "Basic Programming";
	}

}
