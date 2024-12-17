package state;

import student.Student;

public class AdvancedProgramming implements State{	
	
	@Override
	public void nextState(Student student) {
		student.setCurrState(new ProjectSubmission());
	}
	
	@Override
	public String toString() {
		return "Advanced Programming";
	}

}
