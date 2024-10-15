package adapters;

public class DigitalWalletPaymentAdapter implements PaymentAdapter {

	@Override
	public double getPriceInPayment(double price) {

		return price * 0.9;
	}

}
