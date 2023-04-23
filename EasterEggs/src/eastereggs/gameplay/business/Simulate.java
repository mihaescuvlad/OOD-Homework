package eastereggs.gameplay.business;

import java.util.ArrayList;

import eastereggs.service.IRabbit;

public class Simulate implements ISimulate {

	ArrayList<IRabbit> playingRabbits;
	ArrayList<IRabbit> finishedRabbits = new ArrayList<IRabbit>();
	
	public Simulate(ArrayList<IRabbit> iRabbits) {
		playingRabbits = iRabbits;
	}
	
	private Boolean hasFinished() {
		return playingRabbits.isEmpty();
	}
	
	/*
	private void removeFinishedRabbits() {
		// We create a temporary ArrayList of rabbits which will hold all of the rabbits that have not finished the game
		ArrayList<IRabbit> temporaryRabbitContainer = new ArrayList<IRabbit>(playingRabbits);
		
		for(IRabbit iRabbit : temporaryRabbitContainer) {
			// If the rabbit has finished the game it gets added to the `finishedRabbits` list, else it gets added to the temporary list
			if(iRabbit.hasFinished()) {
				finishedRabbits.add(iRabbit);
			} else {
				playingRabbits.remove(iRabbit);
			}
		}
	}
	*/
	
	private void nextTurn() {
		ArrayList<IRabbit> temporaryRabbitContainer = new ArrayList<IRabbit>(playingRabbits);
		
		for(IRabbit iRabbit : temporaryRabbitContainer) {
			iRabbit.move();
		}
	}

	@Override
	public void simulate() {
		do {
			nextTurn();
		} while(hasFinished() == false);
	}
	
	@Override
	public IRabbit getHighestScoreRabbit() {
		IRabbit bestRabbit = finishedRabbits.get(0);
		
		for(IRabbit iRabbit : finishedRabbits) {
			if(iRabbit.hasHigherScore(bestRabbit)) {
				bestRabbit = iRabbit;
			}
		}
		
		return bestRabbit;
	}
}
