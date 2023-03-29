package tax_pay.service.tax;

public class CarTaxInterval {
	
	private int startCC;
	private int endCC;
	private double intervalTax;
	
	public CarTaxInterval(int startCC, int endCC, double intervalTax) {
		this.startCC = startCC;
		this.endCC = endCC;
		this.intervalTax = intervalTax;
	}

	public void setIntervalTax(double intervalTax) {
		this.intervalTax = intervalTax;
	}

	public boolean isOverInterval(int carCC) {
		if(carCC >= endCC) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isInInterval(int carCC) {
		if(startCC <= carCC && carCC <= endCC) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double computeTaxForInterval() {
		double totalTax =  (endCC - startCC) * intervalTax;
		return totalTax;
	}
	
	public double computePartialTaxForInterval(int partialEnd) {
		double totalTax =  (partialEnd - startCC) * intervalTax;
		return totalTax;
	}
	
}
