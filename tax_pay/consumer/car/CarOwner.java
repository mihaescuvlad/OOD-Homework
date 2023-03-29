package tax_pay.consumer.car;

import tax_pay.service.car.ICar;

public class CarOwner implements ICarOwner {
	
	private ICar iCar;
	
	//public CarOwner() {
	//	iCar = null;
	//}

	@Override
	public void purchase(ICar iCar) {
		this.iCar = iCar;
	}

	@Override
	public void sell() {
		this.iCar = null;
	}
	
	@Override
	public ICar getCarData() {
		return iCar;
	}

}
