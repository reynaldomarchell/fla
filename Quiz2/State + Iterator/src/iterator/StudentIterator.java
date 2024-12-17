package iterator;

import java.util.ArrayList;

import student.Student;

public class StudentIterator implements IStudentIterator<Student>{

	private ArrayList<Student> students;
	private int currPos = 0;
	
	public StudentIterator(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public boolean hasNext() {
		return currPos < students.size();
	}

	@Override
	public Student next() {
		if(hasNext()) {
			return students.get(currPos++);
		}
		return null;
	}

}
