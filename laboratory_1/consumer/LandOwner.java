package laboratory_1.consumer;

import java.util.ArrayList;
import java.util.List;
import laboratory_1.service.land.ILand;

public class LandOwner implements ILandOwner {
	
	private List<ILand> iLands = new ArrayList<>();
	
	@Override
	public void purchase(ILand iLand) {
		this.iLands.add(iLand);
	}
	
	@Override
	public void sell(int index) throws Exception {
		if(index < 0 || index > this.iLands.size()) {
			throw new Exception("Index out of list bounds.");
		}
		
		this.iLands.remove(index);
	}
	
	@Override
	public double computeTotalPlotArea() {
		double totalArea = 0.0;
		
		for(ILand iLand : iLands) {
			totalArea += iLand.computeArea();
		}
		
		return totalArea;
	}
	
}
