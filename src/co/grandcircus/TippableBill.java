package co.grandcircus;

public class TippableBill extends Bill {

	private double tip;
	

	public double getTip() {
		return tip;
	}

	public void setTip(double tip) {
		this.tip = tip;
	}

	public TippableBill() {
		super();
	}

	public TippableBill(double subtotal, double taxRate, double tip) {
		super(subtotal, taxRate);
		this.tip = tip;
	}

	@Override
	public double getSubtotal() {
		// TODO Auto-generated method stub
		return super.getSubtotal();
	}

	@Override
	public void setSubtotal(double subtotal) {
		// TODO Auto-generated method stub
		super.setSubtotal(subtotal);
	}

	@Override
	public double getTaxRate() {
		// TODO Auto-generated method stub
		return super.getTaxRate();
	}

	@Override
	public void setTaxRate(double taxRate) {
		// TODO Auto-generated method stub
		super.setTaxRate(taxRate);
	}

	@Override
	public double calcTotal() {
		// TODO Auto-generated method stub
		return super.calcTotal() + tip;
	}

	

	
}
