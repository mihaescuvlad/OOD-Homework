package tax_pay.service.tax;

import java.util.ArrayList;
import java.util.List;

public class SimpleCarTaxCalculator implements ICarTaxCalculator {
	
	private List<CarTaxInterval> carTaxIntervals = new ArrayList<>();
	
	public void addInterval(int startInterval, int endInterval, double tax) {
		this.carTaxIntervals.add(new CarTaxInterval(startInterval, endInterval, tax));
	}

	public void setTax(int index, double tax) {
		this.carTaxIntervals.get(index).setIntervalTax(tax);
	}
	
	public void clearIntervals() {
		carTaxIntervals.clear();
	}
	
	public void removeInterval(int index) {
		carTaxIntervals.remove(index);
	}
	
	@Override
	public double computeTax(int engineCC) {
		double totalTax = 0.0;
		
		for(CarTaxInterval carTaxInterval : carTaxIntervals) {
			if(carTaxInterval.isOverInterval(engineCC)) {
				totalTax += carTaxInterval.computeTaxForInterval();
			} else if(carTaxInterval.isInInterval(engineCC)) {
				totalTax += carTaxInterval.computePartialTaxForInterval(engineCC);
			}
		}
		
		return totalTax;
	}

}
