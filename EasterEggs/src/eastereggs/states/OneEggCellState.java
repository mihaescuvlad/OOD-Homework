package eastereggs.states;

import eastereggs.service.IRabbit;

public class OneEggCellState implements ICellState {

	private int eggScore;
	
	OneEggCellState(int eggScore) {
		this.eggScore = eggScore;
	}
	
	@Override
	public ICellState nextState(IRabbit iRabbit) {
		iRabbit.collectEgg(eggScore);
		iRabbit.changeState();
		
		return new EmptyCellState();
	}
	
}
