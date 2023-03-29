package EmagHero.service.creature;

public class ChainAttack implements IChainAttack{
	
	ILuck luck;
	
	public ChainAttack(ILuck luck) {
		this.luck = luck;
	}
	
	@Override
	public Boolean useSpell() {
		return luck.isLucky();
	}
	
}
