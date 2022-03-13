package d;

public class EmployeeRecord {
	public static void main(String[] args) {
		CommissionEmployee employee=new
				CommissionEmployee(121, "amit", 2.1, 2000000);
		System.out.println(employee.getPayment());
	}

}
