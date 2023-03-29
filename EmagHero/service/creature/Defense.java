package EmagHero.service.creature;

public class Defense implements IDefense{
	
	int defense;
	
	public Defense(int defense) {
		this.defense = defense;
	}

	@Override
	public int computeDamage(int attack) {
		return this.defense - attack;
	}
	
}
