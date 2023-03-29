package laboratory_1.consumer;

import laboratory_1.service.land.ILand;

public interface ILandOwner {
	
	public void purchase(ILand iLand);
	public void sell(int Index) throws Exception;
	public double computeTotalPlotArea();
	
}
