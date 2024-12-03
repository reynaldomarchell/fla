package main;


//Concrete subclass for the Math Department
class MathDepartment extends GradingSystem {
	 @Override
	 protected void collectStudentInfo(Student student) {
	     // Collect information specific to math students
	     // e.g. math courses taken, test scores, etc.
	 }
	
	 @Override
	 protected void evaluatePerformance(Student student) {
	     // Evaluate math student performance based on specific criteria
	     // e.g. homework, exams, projects, etc.
	 }
	
	 @Override
	 protected int calculateGrade(Student student) {
	     // Calculate the student's grade based on math-specific evaluation
	     // e.g. weighted average of test scores, homework, and projects
	     return (int) (student.getTestScore() * 0.6 + 
	    		 student.getHomeworkScore() * 0.3 + 
	    		 student.getProjectScore() * 0.1);
	 }
}
