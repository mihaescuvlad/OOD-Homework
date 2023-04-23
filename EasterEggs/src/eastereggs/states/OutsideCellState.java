package eastereggs.states;

import java.util.ArrayList;

import eastereggs.service.IRabbit;

public class OutsideCellState implements ICellState {

	private ICellState currentState;
    private ArrayList<IRabbit> playingRabbits;
	private ArrayList<IRabbit> finishedRabbits;
	
	OutsideCellState(ArrayList<IRabbit> playingRabbits, ArrayList<IRabbit> finishedRabbits)
	{
		this.playingRabbits = playingRabbits;
		this.finishedRabbits = finishedRabbits;
		
		currentState = this;
	}
	
	@Override
	public ICellState nextState(IRabbit iRabbit) {
		finishedRabbits.add(iRabbit);
		playingRabbits.remove(iRabbit);
		
		return currentState;
	}
	
}
