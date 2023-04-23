package eastereggs.states;

import eastereggs.service.IPosition;

public class TowardsSouthRabbitState implements IRabbitState {
	
	IPosition iPosition;
	
	TowardsSouthRabbitState(IPosition iPosition) {
		this.iPosition = iPosition;
	}
	
	@Override
	public void move() {
		iPosition.moveNorth();
	}
	
	@Override
	public IRabbitState nextState() {
		//iPosition.changeState(new TowardsEastRabbitState(iPosition));
		return new TowardsEastRabbitState(iPosition);
	}
}