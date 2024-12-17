package state;

import student.Student;

public class AdvancedDesign implements State{

	@Override
	public void nextState(Student student) {
		student.setCurrState(new PortofolioSubmission());
		
	}
	
	@Override
	public String toString() {
		return "Advanced Design";
	}

}
