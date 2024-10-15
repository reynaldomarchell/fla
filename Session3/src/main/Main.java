package main;

import java.util.ArrayList;

public class Main {
	
	public Main() {
//		Computer basic = new Computer("B360M", "Ryzen 5 5600", "ADATA 8GB", "400W", "500GB");
//		Computer withGPU = new Computer("B360M", "Ryzen 5 5600", "ADATA 8GB", "400W", "500GB", true);
//		Computer complete = new Computer("B360M", "Ryzen 5 5600", "ADATA 8GB", "400W", "500GB", true, true, true);
	
		
		
//		ComputerWithBuilder basic = 
//				new ComputerWithBuilder
//				.ComputerBuilder("B360M", "Ryzen 5 5600", "ADATA 8GB", "400W", "500GB")
//				.build();
//		ComputerWithBuilder withGPU = 
//				new ComputerWithBuilder
//				.ComputerBuilder("B360M", "Ryzen 5 5600", "ADATA 8GB", "400W", "500GB")
//				.enableGPU()
//				.build();
//		ComputerWithBuilder complete = 
//				new ComputerWithBuilder
//				.ComputerBuilder("B360M", "Ryzen 5 5600", "ADATA 8GB", "400W", "500GB")
//				.enableGPU().enableSSD().enableReceiver()
//				.build();
//		
//		basic.printComputer();
//		System.out.println("---------------------------");
//		withGPU.printComputer();
//		System.out.println("---------------------------");
//		complete.printComputer();
		
		
		
		ArrayList<Book> copiedBooks = new ArrayList<>();
		Book originalBook = new Book("Naruto", "Makoto Shinkai", 50);
		
		for(int i=0; i<100; i++) {
//			copiedBooks.add(new Book(
//					originalBook.getTitle(), 
//					originalBook.getAuthor(), 
//					originalBook.getPages()));
			
			try {
				Book copyBook = (Book) originalBook.clone();
				copiedBooks.add(copyBook);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
