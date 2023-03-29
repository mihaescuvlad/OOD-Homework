package EmagHero.service.builder;

import EmagHero.service.PRNG.IPRNG;
import EmagHero.service.creature.Defense;
import EmagHero.service.creature.Health;
import EmagHero.service.creature.IDefense;
import EmagHero.service.creature.IHealth;
import EmagHero.service.creature.ILuck;
import EmagHero.service.creature.ISpeed;
import EmagHero.service.creature.Luck;
import EmagHero.service.creature.Monster;
import EmagHero.service.creature.Speed;

public class CreatureBuilder implements ICreatureBuilder {
	
	IPRNG iPRNG;
	IHealth health;
	int strength;
	IDefense defense;
	ISpeed speed;
	ILuck luck;
	
	@Override
	public void setPRNG(IPRNG prng) {
		iPRNG = prng;
	}

	@Override
	public void setRandomHealth(int start, int end) {
		health = new Health(iPRNG.ComputeInRange(start, end));
	}

	@Override
	public void setRandomStrength(int start, int end) {
		strength = iPRNG.ComputeInRange(start, end);
	}

	@Override
	public void setRandomDefense(int start, int end) {
		defense = new Defense(iPRNG.ComputeInRange(start, end));
	}

	@Override
	public void setRandomSpeed(int start, int end) {
		speed = new Speed(iPRNG.ComputeInRange(start, end));
	}

	@Override
	public void setRandomLuck(int start, int end) {
		luck = new Luck(iPRNG.ComputeInRange(start, end), iPRNG);
	}
	
	public Monster getResult() {
		return new Monster(health, strength, defense, speed, luck, iPRNG);
	}
	
}
