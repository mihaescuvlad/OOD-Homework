package laboratory_1.main;

import laboratory_1.consumer.LandOwner;
import laboratory_1.service.land.RectangularLand;
import laboratory_1.service.land.SquareLand;
import laboratory_1.service.land.TriangularLand;
import laboratory_1.service.land.CircularLand;

public class Main {

	public static void main(String[] args) {
		LandOwner landOwner = new LandOwner();
		
		landOwner.purchase(new RectangularLand(100.0, 200.0));
		landOwner.purchase(new SquareLand(50.0));
		
		System.out.println("First two lands: " + landOwner.computeTotalPlotArea());
		
		landOwner.purchase(new RectangularLand(100.5, 100.2));
	
		System.out.println("Addded fractional land: " + landOwner.computeTotalPlotArea());
		
		try {
			landOwner.sell(1);
		} catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}
		
		System.out.println("Removed the second land (Index 1): " + landOwner.computeTotalPlotArea());
		
		try {
			landOwner.purchase(new TriangularLand(2.0, 5.0, 4.0));
		} catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}
		
		System.out.println("Added a triangular land: " + landOwner.computeTotalPlotArea());
		
		try {
			landOwner.sell(2);
			landOwner.sell(1);
			landOwner.sell(0);
		} catch(Exception e) {
			System.out.println("Exception caught: " + e);
		}
		
		landOwner.purchase(new CircularLand(10.0));
		
		System.out.println("Removed all lands and introduced a circular land: " + landOwner.computeTotalPlotArea());
		
	}
	
}
