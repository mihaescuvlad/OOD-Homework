package tax_pay;

import laboratory_1.consumer.LandOwner;
import laboratory_1.service.land.CircularLand;
import laboratory_1.service.land.RectangularLand;
import laboratory_1.service.land.SquareLand;
import tax_pay.consumer.car.CarOwner;
import tax_pay.service.builder.ITaxBuilder;
import tax_pay.service.builder.TaxBuilder;
import tax_pay.service.car.Car;
import tax_pay.service.tax_manager.ITaxPayerManager;
import tax_pay.service.tax_manager.TaxPayerManager;

public class Main {

	public static void main(String[] args) {
		
		ITaxBuilder iTaxBuilder = new TaxBuilder();
		
		iTaxBuilder.setLandTax(0.01);
		iTaxBuilder.setLandOwner(new LandOwner());
		iTaxBuilder.setCarOwner(new CarOwner());
		iTaxBuilder.addCarTaxInterval(0, 500, 2.0);
		iTaxBuilder.addCarTaxInterval(501, 1000, 3.0);
		iTaxBuilder.addCarTaxInterval(1001, 2000, 4.0);
		iTaxBuilder.addCarTaxInterval(2001, 5000, 7.5);
		
		ITaxPayerManager iTaxPayerManager = new TaxPayerManager();
		iTaxPayerManager.add(iTaxBuilder.constructTaxPayer());
		
		iTaxPayerManager.getTaxPayerById(0).buyTerrain(new SquareLand(50.0));
		iTaxPayerManager.getTaxPayerById(0).buyTerrain(new RectangularLand(100.0, 200.0));
		
		System.out.println("Tax for land owner 0: " + iTaxPayerManager.getTaxPayerById(0).computeTotalTax());
		
		iTaxPayerManager.getTaxPayerById(0).sellTerrain(0);
		System.out.println("Tax for land owner 0: " + iTaxPayerManager.getTaxPayerById(0).computeTotalTax());
		
		iTaxPayerManager.getTaxPayerById(0).buyCar(new Car(1200));
		System.out.println("Tax for land owner 0: " + iTaxPayerManager.getTaxPayerById(0).computeTotalTax());
		
		iTaxPayerManager.getTaxPayerById(0).sellTerrain(0);
		System.out.println("Tax for land owner 0: " + iTaxPayerManager.getTaxPayerById(0).computeTotalTax());
		
		
		iTaxBuilder.setLandTax(0.03);
		iTaxPayerManager.add(iTaxBuilder.constructTaxPayer());
		
		iTaxPayerManager.getTaxPayerById(1).buyTerrain(new CircularLand(10.0));
		
		System.out.println("Tax for land owner 1: " + iTaxPayerManager.getTaxPayerById(1).computeTotalTax());
		
	}
	
}
