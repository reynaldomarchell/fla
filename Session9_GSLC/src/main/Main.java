package main;

public class Main {
    public static void main(String[] args) {
        Student mathStudent = new Student();
        mathStudent.setName("John Doe");
        mathStudent.setTestScore(85.0);
        mathStudent.setHomeworkScore(90.0);
        mathStudent.setProjectScore(88.0);

        GradingSystem mathGrading = new MathDepartment();
        mathGrading.gradeStudent(mathStudent);

        Student englishStudent = new Student();
        englishStudent.setName("Jane Smith");
        englishStudent.setEssayScore(92.0);
        englishStudent.setParticipationScore(85.0);
        englishStudent.setPresentationScore(88.0);

        GradingSystem englishGrading = new EnglishDepartment();
        englishGrading.gradeStudent(englishStudent);
    }
}