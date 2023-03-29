package tax_pay.consumer.car;

import tax_pay.service.car.ICar;

public interface ICarOwner {

	void purchase(ICar iCar);
	void sell();
	ICar getCarData();
	
}
