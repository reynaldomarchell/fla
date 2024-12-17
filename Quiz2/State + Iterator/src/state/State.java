package state;

import student.Student;

public interface State {
	void nextState(Student student);
}
