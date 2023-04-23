package eastereggs.states;

import eastereggs.service.IRabbit;

public interface ICellState {

	ICellState nextState(IRabbit iRabbit);
	
}
