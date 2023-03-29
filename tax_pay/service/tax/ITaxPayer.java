package tax_pay.service.tax;

import laboratory_1.service.land.ILand;
import tax_pay.service.car.ICar;

public interface ITaxPayer {
	
	void buyTerrain(ILand iLand);
	void sellTerrain(int index);
	void buyCar(ICar iCar);
	void sellCar(int index);
	double computeTotalTax();
	
}
