package f;

public class PaymentSystem {
	public static void main(String[] args) {
		CommissionEmployee employee=new
				CommissionEmployee(121, "amit", 2.1, 2000000);
		Invoice invoice=new Invoice("A123", "Electronic23W", 20, 3000);
		
		PaymentProcessingSystem.processPayment(employee);
	}

}
