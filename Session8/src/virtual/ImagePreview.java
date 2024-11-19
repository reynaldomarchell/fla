package virtual;

public class ImagePreview implements IImagePreview{
	String content;
	
	public ImagePreview(String filename) {
		this.content = loadImage(filename);
		System.out.println("Preparing image...");
		
	}
	
	private String loadImage(String filename) {
		System.out.println("Loading image from disk");
		
		return "Content of " + filename;
		
	}
	
	@Override
	public void show() {
		System.out.println(content);
		
	}

}
