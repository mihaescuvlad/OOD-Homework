package laboratory_1.service.land;

import java.lang.Math;

public class TriangularLand implements ILand {

	private double side1 = 0.0;
	private double side2 = 0.0;
	private double side3 = 0.0;
	
	public TriangularLand(double side1, double side2, double side3) throws Exception {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			throw new Exception("Specified side lengths can not form a triangle.");
		}
	}

	@Override
	public double computeArea() {
		return 1.0 / 4.0 * Math.sqrt((side1 + side2 + side3) * (-side1 + side2 + side3) * 
									(side1 - side2 + side3) * (side1 + side2 - side3));
	}
	
}
