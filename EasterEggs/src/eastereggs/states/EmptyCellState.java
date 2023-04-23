package eastereggs.states;

import eastereggs.service.IRabbit;

public class EmptyCellState implements ICellState {
	
	private ICellState currentState = new EmptyCellState();
	
	@Override
	public ICellState nextState(IRabbit iRabbit) {
		return currentState;
	}
	
}
