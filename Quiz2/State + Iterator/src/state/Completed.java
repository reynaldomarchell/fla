package state;

import student.Student;

public class Completed implements State{

	@Override
	public void nextState(Student student) {
		System.out.println("Completed!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Completed";
	}

}
