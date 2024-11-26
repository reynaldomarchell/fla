package object;

public class Promo {
	private String promoName;
	private String promoContent;
	
	public Promo(String promoName, String promoContent) {
		super();
		this.promoName = promoName;
		this.promoContent = promoContent;
	}
	
	@Override
	public String toString() {
		
		return String.format("Promo: %s - %s", promoName, promoContent);
	}
}
