package eastereggs.builders;

import eastereggs.service.IGrid;
import eastereggs.service.IPosition;
import eastereggs.states.IRabbitState;

public interface IRabbitBuilder {

	void setState(IRabbitState iRabbitState);
	void setGrid(IGrid iGrid);
	void setPosition(IPosition iPosition);
	
}
