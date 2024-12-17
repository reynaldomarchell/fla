package main;

import java.util.ArrayList;
import java.util.Scanner;

import iterator.IStudentIterator;
import iterator.StudentIterator;
import student.Student;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> database = new ArrayList<Student>();
	
	public String generateId() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String id = "";
		
		for(int i = 0; i < 6; i++) {
			id = id + chars.charAt((int) (Math.random() * chars.length()));
		}
		
		return id;
	}
	
	public void register() {
		System.out.println("Input your name: ");
		String name = scan.nextLine();
		System.out.println("Input your age: ");
		Integer age = Integer.parseInt(scan.nextLine());
		System.out.println("Choose your course (Programming | Design): ");
		String course = scan.nextLine();
		
		String id = generateId();
		
		database.add(new Student(id, name, age, course));
		System.out.println("Successfully register!");
	}
	
	public void viewStudents() {
		
		if(database.size() == 0) {
			System.out.println("No students data");
		}
		
		IStudentIterator<Student> iterator = new StudentIterator(database);
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			while(!student.getCurrState().toString().equals("Completed")) {
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getAge());
				System.out.println(student.getSelectedCourse());
				System.out.println(student.getCurrState());
				
				System.out.println("Input N or Q: ");
				String choice = scan.nextLine();
				if(choice.equals("N")) {
					student.getCurrState().nextState(student);
				}
				else {
					break;
				}
			}
		}
		
	}
	
	public Main() {
		int choice = -1;
		
		do {
			System.out.println("1. Register New Student");
			System.out.println("2. View Students");
			System.out.println("3. Exit");
			choice = Integer.parseInt(scan.nextLine());
			
			switch(choice) {
			case 1:
				register();
				break;
			case 2:
				viewStudents();
				break;
			case 3:
				return;
			default:
				System.out.println("There's no such an option!");
			}
			
		} while(choice != 3);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
