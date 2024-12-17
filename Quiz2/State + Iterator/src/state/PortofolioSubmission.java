package state;

import student.Student;

public class PortofolioSubmission implements State{

	@Override
	public void nextState(Student student) {
		student.setCurrState(new Completed());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Portofolio Submisson";
	}
}
