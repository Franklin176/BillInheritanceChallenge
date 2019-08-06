package co.grandcircus;

public class RestaurantApp {

	public static void main(String[] args) {
	
		Bill bill = new Bill();
		bill.setSubtotal(15.80);
		bill.setTaxRate(0.06);
		
		pay(bill);
		
		TippableBill tipBill = new TippableBill();
		tipBill.setSubtotal(8.50);
		tipBill.setTaxRate(0.06);
		tipBill.setTip(2.00);
		
		pay(tipBill);
	}
		public static void pay(Bill bill) {	
			
			 System.out.println("$" + bill.calcTotal());
		

	}

}
