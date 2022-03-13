package d;

public class CommissionEmployee {
	private double commisionPercentage;
	private double totalSales;

	public CommissionEmployee(int id, String name, double commisionPercentage, double totalSales) {
		super();
		this.commisionPercentage = commisionPercentage;
		this.totalSales = totalSales;
	}

	public double getPayment() {
		return totalSales * commisionPercentage / 100;
	}


}
