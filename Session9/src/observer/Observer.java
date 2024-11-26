package observer;

import object.Promo;

public interface Observer {
	// 0 -> VIP + Normal
	// 1 -> Normal
	// 2 -> VIP
	public void update(Promo promo, int type);	

}
