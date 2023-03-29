package EmagHero.service.creature;

public interface ICreature {

	void defend(int strength);
	void attack(ICreature creature);
	Boolean isAttackingFirst(ICreature creature);
	Boolean isAttackingFirst(ISpeed iSpeed, ILuck iLuck);
	Boolean isAlive();
	//void Attack(List<ICreature> creature);
	
	//void UseSkill(ICreature creature);
	//void UseSkill(List<ICreature> creature);
	
}
