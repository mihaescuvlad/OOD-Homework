package EmagHero.service.creature;

public class Strength implements IStrength{

	int strength;
	
	Strength(int strength) {
		this.strength = strength;
	}

	@Override
	public void attack(ICreature creature) {
		creature.defend(strength);
	}
	
}
