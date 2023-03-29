package tax_pay.service.tax;

import laboratory_1.consumer.ILandOwner;
import laboratory_1.service.land.ILand;
import tax_pay.consumer.car.ICarOwner;
import tax_pay.service.car.ICar;

public class TaxPayer implements ITaxPayer {
// Car owner taxat in functie de CC 0-500cc tax1 = 2 lei pe fiecare cc 501-1000cc tax2 = 1000 + 3 lei pe cc dupa 500 ... 4000cc
	private ILandOwner iLandOwner;
	private ICarOwner iCarOwner;
	private ILandTaxCalculator landTaxCalculator;
	private ICarTaxCalculator carTaxCalculator;
	
	public TaxPayer(ILandOwner iLandOwner, ICarOwner iCarOwner, ILandTaxCalculator landTaxCalculator, ICarTaxCalculator carTaxCalculator) {
		this.iLandOwner = iLandOwner;
		this.iCarOwner = iCarOwner;
		this.landTaxCalculator = landTaxCalculator;
		this.carTaxCalculator = carTaxCalculator;
	}

	@Override
	public void buyTerrain(ILand iLand) {
		iLandOwner.purchase(iLand);
	}
	
	@Override
	public void sellTerrain(int index) {
		try {
			iLandOwner.sell(index);
		} catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}
	
	@Override
	public void buyCar(ICar iCar) {
		iCarOwner.purchase(iCar);
	}
	
	@Override
	public void sellCar(int index) {
		iCarOwner.sell();
	}
	
	private double computeLandTax() {
		double totalArea = iLandOwner.computeTotalPlotArea();
		return landTaxCalculator.computeTax(totalArea);
	}
	
	private double computeCarTax() {
		if(iCarOwner.getCarData() == null)
			return 0.0;
		
		int totalCC = iCarOwner.getCarData().getEngineCC();
		return carTaxCalculator.computeTax(totalCC);
	}
	
	@Override
	public double computeTotalTax() {
		return computeLandTax() + computeCarTax();
	}
	
}
