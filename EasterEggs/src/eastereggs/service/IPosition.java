package eastereggs.service;

public interface IPosition {

	void moveNorth();
	void moveWest();
	void moveSouth();
	void moveEast();
	//Boolean isWithinBounds(int minX, int minY, int maxX, int maxY);
	//Boolean isValid(IGrid iGrid);
	void collectEgg(IRabbit iRabbit);
	
}
