package eastereggs.states;

import eastereggs.service.IPosition;

public class TowardsNorthRabbitState implements IRabbitState {
	
	IPosition iPosition;
	
	TowardsNorthRabbitState(IPosition iPosition) {
		this.iPosition = iPosition;
	}
	
	@Override
	public void move() {
		iPosition.moveNorth();
	}
	
	@Override
	public IRabbitState nextState() {
		return new TowardsWestRabbitState(iPosition);
	}
}
