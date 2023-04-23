package eastereggs.service;

import java.util.ArrayList;

import eastereggs.states.ICellState;

public class Grid implements IGrid {
	
	//ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
	ArrayList<ArrayList<ICellState>> iCellStates = new ArrayList<ArrayList<ICellState>>();
	/*
	public Grid(ArrayList<ArrayList<Integer>> matrix, ArrayList<ArrayList<ICellState>> cellStates) {
		this.matrix = matrix;
		this.cellStates = cellStates;
	}
	*/
	
	public Grid(ArrayList<ArrayList<ICellState>> cellStates) {
		this.iCellStates = cellStates;
	}

	@Override
	public void collectEgg(int x, int y, IRabbit iRabbit) {
		ICellState currentCell = iCellStates.get(x).get(y);
		
		currentCell.nextState(iRabbit);
	}
	
	/*
	@Override
	public int collectEgg(IPosition iPosition) {
		return iPosition.collectEgg(this);
	}
	*/

	/*
	@Override
	public Boolean isValid(IPosition iPosition) {
		//int maxRows = iCellStates.size();
		//int maxColumns = iCellStates.get(0).size();
		
		//return iPosition.isWithinBounds(0, 0, maxRows, maxColumns);
		return iPosition.isValid(this);
	}
	
	
	@Override
	public Boolean isValid(int x, int y) {
		ICellState currentCell = iCellStates.get(x).get(y);
		
		return currentCell.isInBounds();
	}
	*/
	
}
