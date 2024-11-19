package virtual;

public class ImagePreviewProxy implements IImagePreview {
	private ImagePreview imagePreview;
	private String filename;
	
	public ImagePreviewProxy(String filename) {
		this.filename = filename;
	}

	@Override
	public void show() {
		if (imagePreview == null) {
            imagePreview = new ImagePreview(filename);
        }
        imagePreview.show();
		
	}

}
