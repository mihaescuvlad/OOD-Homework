package laboratory_1.service.land;

public class CircularLand implements ILand {

	// Bad design, avoid the 'static' keyword.
	private static final double PI = 3.1415926535897932;
	
	private double radius = 0.0;
	
	public CircularLand(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return PI * radius * radius;
	}

}
