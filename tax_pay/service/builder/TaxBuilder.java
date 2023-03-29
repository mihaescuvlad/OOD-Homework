package tax_pay.service.builder;

import laboratory_1.consumer.ILandOwner;
import tax_pay.consumer.car.ICarOwner;
import tax_pay.service.tax.SimpleCarTaxCalculator;
import tax_pay.service.tax.SimpleLandTaxCalculator;
import tax_pay.service.tax.TaxPayer;

public class TaxBuilder implements ITaxBuilder {

	private ILandOwner iLandOwner;
	private ICarOwner iCarOwner;
	private SimpleLandTaxCalculator landTaxCalculator;
	private SimpleCarTaxCalculator carTaxCalculator;
	
	public TaxBuilder() {
		landTaxCalculator = new SimpleLandTaxCalculator();
		carTaxCalculator = new SimpleCarTaxCalculator();
	}

	@Override
	public void setLandTax(double tax) {
		this.landTaxCalculator.setTax(tax);
	}
	
	@Override
	public void setTaxInterval(int index, double tax) {
		this.carTaxCalculator.setTax(index, tax);
	}
	
	@Override
	public void addCarTaxInterval(int startInterval, int endInterval, double tax) {
		this.carTaxCalculator.addInterval(startInterval, endInterval, tax);
	}
	
	@Override
	public void clearCarTax() {
		carTaxCalculator.clearIntervals();
	}
	
	@Override
	public void removeCarTaxInterval(int index) {
		carTaxCalculator.removeInterval(index);
	}
	
	@Override
	public void setLandOwner(ILandOwner iLandOwner) {
		this.iLandOwner = iLandOwner;
	}
	
	@Override
	public void setCarOwner(ICarOwner iCarOwner) {
		this.iCarOwner = iCarOwner;
	}

	@Override
	public TaxPayer constructTaxPayer() {
		return new TaxPayer(iLandOwner, iCarOwner, landTaxCalculator, carTaxCalculator);
	}
	
}
