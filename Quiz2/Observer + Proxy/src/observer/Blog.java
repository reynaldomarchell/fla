package observer;

import java.util.ArrayList;


public class Blog implements Observable{

	private String blogName;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private ArrayList<String> posts = new ArrayList<String>();
	
	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public ArrayList<String> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<String> posts) {
		this.posts = posts;
	}

	public Blog(String blogName) {
		this.blogName = blogName;
	}

	@Override
	public void addUser(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeUser(Observer observer) {
		observers.remove(observer);
	}
	
	public void addPost(String post) {
		posts.add(post);
		notifyObserver("New Post: " + post);
	}
	
	public void updatePost(String post) {
		
	}
	
	public void removePost(String post) {
		posts.remove(post);
	}

	@Override
	public void notifyObserver(String message) {
		for(Observer observer : observers) {
			observer.update(blogName, message);
		}
	}

}
