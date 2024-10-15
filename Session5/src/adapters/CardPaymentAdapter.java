package adapters;

public class CardPaymentAdapter implements PaymentAdapter {

	@Override
	public double getPriceInPayment(double price) {

		return price * 1.1;
	}

}
