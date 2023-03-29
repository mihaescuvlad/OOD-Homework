package laboratory_1.service.land;

public class RectangularLand implements ILand {
	
	private double width = 0.0;
	private double height = 0.0;
	
	public RectangularLand(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double computeArea() {
		return width * height;
	}
	
}
