package EmagHero.service.PRNG;

public class BasicPRNG implements IPRNG {

	@Override
	public int ComputeInRange(int start, int end) {
		int randomNumber = (int)Math.random() * end;
		
		if(randomNumber < start) {
			randomNumber += start;
		}
		
		return randomNumber;
	}

}
