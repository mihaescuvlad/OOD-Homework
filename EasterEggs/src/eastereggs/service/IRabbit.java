package eastereggs.service;

public interface IRabbit {

	//void updatePosition(Character direction);
	void changeState();
	void move();
	void collectEgg(int eggScore);
	//Boolean hasFinished();
	Boolean hasHigherScore(IRabbit iRabbit);
	Boolean hasLowerScore(int score);
	
}
