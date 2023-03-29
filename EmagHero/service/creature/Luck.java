package EmagHero.service.creature;

import EmagHero.service.PRNG.IPRNG;

public class Luck implements ILuck{
	
	IPRNG iPRNG;
	int luck;
	
	public Luck(int luck, IPRNG iPRNG) {
		this.luck = luck;
		this.iPRNG = iPRNG;
	}

	@Override
	public Boolean isGreater(ILuck iLuck) {
		return iLuck.isGreater(luck);
	}

	@Override
	public Boolean isGreater(int iLuckValue) {
		return luck > iLuckValue;
	}
	
	@Override
	public Boolean isLucky() {
		int randomLuck = iPRNG.ComputeInRange(0, 100);
		
		if(luck <= randomLuck) {
			return true;
		} else {
			return false;
		}
	}
	
}
