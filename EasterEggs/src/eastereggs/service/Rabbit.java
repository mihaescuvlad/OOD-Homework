package eastereggs.service;

import eastereggs.states.IRabbitState;

public class Rabbit implements IRabbit {

	IRabbitState iState;
	IPosition iPosition;
	int time = 0;
	int score = 0;
	
	public Rabbit(IRabbitState iState, IPosition iPosition) {
		this.iState = iState;
		this.iPosition = iPosition;
	}

	@Override
	public void changeState() {
		this.iState = iState.nextState();
	}
	
	@Override
	public void move() {
		iState.move();
		
		iPosition.collectEgg(this);

		time++;
	}

	@Override
	public void collectEgg(int eggScore) {
		score += eggScore;
	}
	
	/*
	@Override
	public Boolean hasFinished() {
		return iGrid.isValid(iPosition) == false;
	}
	*/

	@Override
	public Boolean hasHigherScore(IRabbit iRabbit) {
		return iRabbit.hasLowerScore(score);
	}

	@Override
	public Boolean hasLowerScore(int score) {
		return this.score < score;
	}
}
