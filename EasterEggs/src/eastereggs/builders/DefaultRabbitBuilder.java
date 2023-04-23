package eastereggs.builders;

import eastereggs.service.IGrid;
import eastereggs.service.IPosition;
import eastereggs.service.Rabbit;
import eastereggs.states.IRabbitState;

public class DefaultRabbitBuilder implements IRabbitBuilder {

	IRabbitState iState;
	IGrid iGrid;
	IPosition iPosition;
	
	@Override
	public void setState(IRabbitState iRabbitState) {
			this.iState = iRabbitState;
	}

	@Override
	public void setGrid(IGrid iGrid) {
		this.iGrid = iGrid;
		
	}

	@Override
	public void setPosition(IPosition iPosition) {
		this.iPosition = iPosition;		
	}
	
	public Rabbit getResult() {
		return new Rabbit(iState, iPosition);
	}
	
}
