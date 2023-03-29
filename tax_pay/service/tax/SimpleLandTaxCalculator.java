package tax_pay.service.tax;

public class SimpleLandTaxCalculator implements ILandTaxCalculator{
	
	private double tax;

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public double computeTax(double totalArea) {
		return totalArea * tax;
	}

}
