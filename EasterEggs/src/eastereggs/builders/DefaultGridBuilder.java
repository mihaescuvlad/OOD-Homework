package eastereggs.builders;

import java.util.ArrayList;

import eastereggs.service.Grid;
import eastereggs.states.ICellState;

public class DefaultGridBuilder implements IGridBuilder {

	ArrayList<ArrayList<ICellState>> iCellStates = new ArrayList<ArrayList<ICellState>>();
	
	@Override
	public void setCells(ArrayList<ArrayList<ICellState>> states) {
		iCellStates = states;
	}

	public Grid getResult() {
		return new Grid(iCellStates);
	}
	
}
