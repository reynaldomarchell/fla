package main;

//Concrete subclass for the English Department
class EnglishDepartment extends GradingSystem {
	 @Override
	 protected void collectStudentInfo(Student student) {
	     // Collect information specific to English students
	     // e.g. English courses taken, writing samples, etc.
	 }
	
	 @Override
	 protected void evaluatePerformance(Student student) {
	     // Evaluate English student performance based on specific criteria
	     // e.g. essays, class participation, presentations, etc.
	 }
	
	 @Override
	 protected int calculateGrade(Student student) {
	     // Calculate the student's grade based on English-specific evaluation
	     // e.g. weighted average of essay scores, class participation, and 
		 // presentation grades
	     return (int) (student.getEssayScore() * 0.5 + 
	    		 student.getParticipationScore() * 0.3 + 
	    		 student.getPresentationScore() * 0.2);
	 }
	
	 @Override
	 protected void publishResults(Student student, int grade) {
	     super.publishResults(student, grade);
	     // Perform additional steps for publishing English department results
	     // e.g. notify the student's advisor, update the department's website, etc.
	 }
}