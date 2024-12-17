package main;

import java.util.Scanner;

import observer.Blog;
import observer.User;
import proxy.BlogEditor;
import proxy.BlogEditorProxy;
import proxy.IBlogEditor;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		Blog dtBlog = new Blog("Deez Blog");
		
		User alice = new User("Alice");
		User bob = new User("Bob");
		User john = new User("John");
		
		dtBlog.addUser(alice);
		dtBlog.addUser(bob);
		dtBlog.addUser(john);
		
		IBlogEditor blogEditor = new BlogEditor(dtBlog);
		
		IBlogEditor aliceBlogEditor = new BlogEditorProxy(blogEditor, "Admin");
		IBlogEditor bobBlogEditor = new BlogEditorProxy(blogEditor, "Editor");
		IBlogEditor charlieBlogEditor = new BlogEditorProxy(blogEditor, "Viewer");
		
		int choice = -1;
		
		while(choice != 6) {			
			System.out.println("1. Add Post");
			System.out.println("2. Update Post");
			System.out.println("3. Delete Post");
			System.out.println("4. View All Posts");
			System.out.println("5. Subscibe to Blog Updates");
			System.out.println("6. Exit");
			choice = Integer.parseInt(scan.nextLine());
			
			switch (choice) {
			case 1:
				System.out.println("Enter the post: ");
				String post = scan.nextLine();
				aliceBlogEditor.addPost(post);
				bobBlogEditor.addPost(post);
				charlieBlogEditor.addPost(post);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				for(String posts : dtBlog.getPosts()) {
					System.out.println(posts);
				}
				break;
			case 5:
				System.out.println("Enter your name:");
				String name = scan.nextLine();
				User newUser = new User(name);
				dtBlog.addUser(newUser);
				
				break;
			case 6:
				return;

			default:
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
