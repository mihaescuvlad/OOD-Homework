package EmagHero.service.creature;

import EmagHero.service.PRNG.IPRNG;

public class Monster implements ICreature {
	
	IPRNG iPRNG;
	IHealth iHealth;
	int strength;
	IDefense iDefense;
	ISpeed iSpeed;
	ILuck iLuck;
			
	public Monster(IHealth iHealth, int strength, IDefense iDefense, ISpeed iSpeed, ILuck iLuck, IPRNG iPRNG) {
		this.iHealth = iHealth;
		this.strength = strength;
		this.iDefense = iDefense;
		this.iSpeed = iSpeed;
		this.iLuck = iLuck;
		this.iPRNG = iPRNG;
	};

	@Override
	public void defend(int strength) {
		if (iLuck.isLucky()) { 
			return;
		}
		
		int damage = this.iDefense.computeDamage(strength);
		this.iHealth.subtractHealth(damage);
	}
	
	@Override
	public void attack(ICreature creature) {
		defend(strength);
	}
	
	@Override
	public Boolean isAttackingFirst(ICreature creature) {
		return creature.isAttackingFirst(iSpeed, iLuck);
	}
	
	@Override
	public Boolean isAttackingFirst(ISpeed iSpeed, ILuck iLuck) { 
		if(this.iSpeed.isGreater(iSpeed)) {
			return true;
		} else if(this.iSpeed.isEqual(iSpeed)) {
			if(this.iLuck.isGreater(iLuck)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public Boolean isAlive() {
		return this.iHealth.isPositive();
	}
}
