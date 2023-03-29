package tax_pay.service.builder;

import laboratory_1.consumer.ILandOwner;
import tax_pay.consumer.car.ICarOwner;
import tax_pay.service.tax.TaxPayer;

public interface ITaxBuilder {
	
	void setLandTax(double tax);
	void setTaxInterval(int index, double tax);
	void addCarTaxInterval(int startInterval, int endInterval, double tax);
	void clearCarTax();
	void removeCarTaxInterval(int index);
	void setLandOwner(ILandOwner iLandOwner);
	void setCarOwner(ICarOwner iCarOwner);
	TaxPayer constructTaxPayer();
	
}
