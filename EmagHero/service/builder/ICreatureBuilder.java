package EmagHero.service.builder;

import EmagHero.service.PRNG.IPRNG;

public interface ICreatureBuilder {

	void setPRNG(IPRNG prng);
	void setRandomHealth(int start, int end);
	void setRandomStrength(int start, int end);
	void setRandomDefense(int start, int end);
	void setRandomSpeed(int start, int end);
	void setRandomLuck(int start, int end);
	
}
