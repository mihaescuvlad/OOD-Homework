package EmagHero.service.creature;

public class Hero implements ICreature{

	ICreature innerCreature;
	IRapidStrike rapidStrike;
			
	public Hero(ICreature innerCreature, IRapidStrike rapidStrike) {
		this.innerCreature = innerCreature;
		this.rapidStrike = rapidStrike;
	};

	@Override
	public void defend(int strength) {
		innerCreature.defend(strength);
	}
	
	@Override
	public void attack(ICreature creature) {
		innerCreature.attack(creature);
		
		// Rapid Strike
		if(rapidStrike.useSpell()) {
			innerCreature.attack(creature);
		}
	}

	public Boolean isAttackingFirst(ICreature creature) {
		return innerCreature.isAttackingFirst(creature);
	}

	public Boolean isAttackingFirst(ISpeed iSpeed, ILuck iLuck) {
		return innerCreature.isAttackingFirst(iSpeed, iLuck);
	}

	public Boolean isAlive() {
		return innerCreature.isAlive();
	}
	
}
