package tax_pay.service.car;

public class Car implements ICar {
	
	private int engineCC;

	public Car(int engineCC) {
		this.engineCC = engineCC;
	}

	@Override
	public int getEngineCC() {
		return engineCC;
	}

}
