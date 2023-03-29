package EmagHero.service.creature;

public class RebornHero implements ICreature{

	Hero innerHero;
	IChainAttack chainAttack;
			
	public RebornHero(Hero innerHero, IChainAttack chainAttack) {
		this.innerHero = innerHero;
		this.chainAttack = chainAttack;
	};

	@Override
	public void defend(int strength) {
		innerHero.defend(strength);
	}
	
	@Override
	public void attack(ICreature creature) {
		innerHero.attack(creature);
		
		if(chainAttack.useSpell()) {
			innerHero.attack(creature);
		}
	}

	public Boolean isAttackingFirst(ICreature creature) {
		return innerHero.isAttackingFirst(creature);
	}

	public Boolean isAttackingFirst(ISpeed iSpeed, ILuck iLuck) {
		return innerHero.isAttackingFirst(iSpeed, iLuck);
	}

	public Boolean isAlive() {
		return innerHero.isAlive();
	}
	
}
