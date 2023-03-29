package EmagHero.service.creature;

public interface ISpeed {

	Boolean isGreater(ISpeed iSpeed);
	Boolean isGreater(int iSpeedValue);
	
	Boolean isEqual(ISpeed iSpeed);
	Boolean isEqual(int iSpeedValue);
	
}
