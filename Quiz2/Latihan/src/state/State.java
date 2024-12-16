package state;

import model.IceCream;

public interface State {
	public void turnMoney();
	public void dispenseMoney();
	public void generateIceCream();
	public void pickingIceCream();
	public IceCream takeIceCream();
}
