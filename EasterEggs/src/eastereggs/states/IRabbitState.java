package eastereggs.states;

public interface IRabbitState {
	
	public void move();
	public IRabbitState nextState();
	
}
