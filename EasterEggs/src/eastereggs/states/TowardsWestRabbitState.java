package eastereggs.states;

import eastereggs.service.IPosition;

public class TowardsWestRabbitState implements IRabbitState {
	
	IPosition iPosition;
	
	TowardsWestRabbitState(IPosition iPosition) {
		this.iPosition = iPosition;
	}
	
	@Override
	public void move() {
		iPosition.moveNorth();
	}
	
	@Override
	public IRabbitState nextState() {
		return new TowardsSouthRabbitState(iPosition);
	}
}
