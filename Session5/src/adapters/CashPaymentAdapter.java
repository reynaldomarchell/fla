package adapters;

public class CashPaymentAdapter implements PaymentAdapter {

	@Override
	public double getPriceInPayment(double price) {
		return price;
	}

}
