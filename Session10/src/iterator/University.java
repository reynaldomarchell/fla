package iterator;

import java.util.ArrayList;

public class University implements Aggregate<Student> {
	private ArrayList<Student> students;

	public University(ArrayList<Student> students) {
		super();
		this.students = students;
	}


	@Override
	public Iterator<Student> createIterator() {
		return new StudentIterator(students);
	}

}
