package main;

//Abstract class defining the template method and common steps
abstract class GradingSystem {
	 public final void gradeStudent(Student student) {
	     collectStudentInfo(student);
	     evaluatePerformance(student);
	     int grade = calculateGrade(student);
	     publishResults(student, grade);
	 }
	
	 protected abstract void collectStudentInfo(Student student);
	 protected abstract void evaluatePerformance(Student student);
	 protected abstract int calculateGrade(Student student);
	 protected void publishResults(Student student, int grade) {
	     System.out.println("Student " + student.getName() 
	     + " received a grade of " + grade);
	 }
}
