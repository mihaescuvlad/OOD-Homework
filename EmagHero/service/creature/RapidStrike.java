package EmagHero.service.creature;

public class RapidStrike implements IRapidStrike {
	
	ILuck luck;
	
	public RapidStrike(ILuck luck) {
		this.luck = luck;
	}
	
	@Override
	public Boolean useSpell() {
		return luck.isLucky();
	}
	
}
