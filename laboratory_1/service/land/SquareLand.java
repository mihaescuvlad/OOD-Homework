package laboratory_1.service.land;

public class SquareLand implements ILand {

	private double sideLength = 0.0;
	
	public SquareLand(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double computeArea() {
		return sideLength * sideLength;
	}
	
}
