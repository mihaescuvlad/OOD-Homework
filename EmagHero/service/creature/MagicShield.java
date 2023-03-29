package EmagHero.service.creature;

public class MagicShield implements IDefense {
	
	int defense;
	ILuck iLuck;
	
	public MagicShield(int defense, ILuck iLuck) {
		this.defense = defense;
		this.iLuck = iLuck;
	}

	@Override
	public int computeDamage(int attack) {
		if(iLuck.isLucky()) {
			return (this.defense - attack) / 2;
		} else {
			return this.defense - attack;
		}
	}
}
