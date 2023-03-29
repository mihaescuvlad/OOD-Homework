package EmagHero.service.creature;

public class Health implements IHealth {
	int health;
	
	public Health(int health) {
		this.health = health;
	}
	
	@Override
	public Boolean isPositive() {
		return health > 0;
	}

	@Override
	public void subtractHealth(int value) {
		health -= value;
	}
	
}
