package pattern.refactoring_guru;

public interface PayStrategy {
	boolean pay(int paymentAmount);
	void collectPaymentDetails();
}
