package EmagHero.service.creature;

public class Speed implements ISpeed{
	int speed;
	
	public Speed(int speed) {
		this.speed = speed;
	}

	@Override
	public Boolean isGreater(ISpeed iSpeed) {
		return iSpeed.isGreater(speed);
	}
	
	@Override
	public Boolean isGreater(int iSpeedValue) {
		return this.speed > iSpeedValue;
	}

	@Override
	public Boolean isEqual(ISpeed iSpeed) {
		return iSpeed.isEqual(speed);
	}
	
	@Override
	public Boolean isEqual(int iSpeedValue) {
		return this.speed == iSpeedValue;
	}
	
}
