package pattern.refactoring_guru;

/**
 * Dummy credit card class.
 */
public class CreditCard {
	private int amount;
	private String number;
	private String date;
	private String cvv;

	public CreditCard(final String number, final String date, final String cvv) {
		this.amount = 100_000;
		this.number = number;
		this.date = date;
		this.cvv = cvv;
	}

	public void setAmount(final int paymentAmount) {
		this.amount -= paymentAmount;
	}

	public int getAmount() {
		return amount;
	}

	public String getNumber() {
		return number;
	}

	public String getDate() {
		return date;
	}

	public String getCvv() {
		return cvv;
	}

}
