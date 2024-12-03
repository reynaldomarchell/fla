package iterator;

import java.util.ArrayList;

public class StudentIterator implements Iterator<Student> {
	private int currentIndex = 0;
	private ArrayList<Student> students;
	

	public StudentIterator(ArrayList<Student> students) {
		super();
		this.students = students;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < students.size();
	}

	@Override
	public Student next() {
		if (!hasNext()) {
			System.out.println("No more students");
		}
		return students.get(currentIndex++);
	}
	

}
