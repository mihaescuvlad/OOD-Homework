package eastereggs.builders;

import java.util.ArrayList;

import eastereggs.states.ICellState;

public interface IGridBuilder {

	void setCells(ArrayList<ArrayList<ICellState>> states);
	
}
