package eastereggs.states;

import eastereggs.service.IPosition;

public class TowardsEastRabbitState implements IRabbitState {
	
	IPosition iPosition;
	
	TowardsEastRabbitState(IPosition iPosition) {
		this.iPosition = iPosition;
	}
	
	@Override
	public void move() {
		iPosition.moveNorth();
	}
	
	@Override
	public IRabbitState nextState() {
		return new TowardsNorthRabbitState(iPosition);
	}
}