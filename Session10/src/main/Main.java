package main;

import java.util.ArrayList;

import iterator.Iterator;
import iterator.Student;
import iterator.University;
import mediator.ChatMediator;
import mediator.ChatRoom;
import mediator.ChatUser;
import mediator.User;

public class Main {
	
	public Main() {
//		ChatMediator mediator = new ChatRoom();
//		User user1 = new ChatUser("John", mediator);
//		User user2 = new ChatUser("Lisa", mediator);
//		User user3 = new ChatUser("David", mediator);
//		User user4 = new ChatUser("Mike", mediator);
//		User user5 = new ChatUser("Chris", mediator);
//		
//		mediator.addUser(user1);
//		mediator.addUser(user2);
//		mediator.addUser(user3);
//		mediator.addUser(user4);
//		mediator.addUser(user5);
//		
//		user1.send("Hello everyone");
		
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("John", 100000));
		students.add(new Student("Lisa", 200000));
		students.add(new Student("David", 300000));
		students.add(new Student("Mike", 400000));
		students.add(new Student("Chris", 500000));
		
		University university = new University(students);
		Iterator<Student> iterator = university.createIterator();
		
		double totalTuitionFee = 0;
		while (iterator.hasNext()) {
			totalTuitionFee += iterator.next().getTuitionFee();
		}
		System.out.println("Total tuition fee: " + totalTuitionFee);
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
