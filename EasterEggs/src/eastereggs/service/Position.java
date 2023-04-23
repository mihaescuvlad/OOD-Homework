package eastereggs.service;

public class Position implements IPosition {

	IGrid iGrid;
	int x;
	int y;
	
	public Position(IGrid iGrid, int x, int y) {
		this.iGrid = iGrid;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void moveNorth() {
		x--;
	}
	
	@Override
	public void moveWest() {
		y--;
	}
	
	@Override
	public void moveSouth() {
		x++;
	}
	
	@Override
	public void moveEast() {
		y++;
	}
	
	/*
	@Override
	public Boolean isWithinBounds(int minX, int minY, int maxX, int maxY) {
		return ((x >= minX && x < maxX) && (y >= minY && y < maxY));
	}
	
	@Override
	public Boolean isValid(IGrid iGrid) {
		return iGrid.isValid(x, y);
	}
	*/
	
	@Override
	public void collectEgg(IRabbit iRabbit) {
		iGrid.collectEgg(x, y, iRabbit);
	}
	
}
