package EmagHero.gameplay;

import EmagHero.service.creature.ICreature;

public class GameLoop {
	
	int gameClock;
	ICreature attacker, defender;
	
	public GameLoop(int gameClock, ICreature player1, ICreature player2) {
		this.gameClock = gameClock;
		if(player1.isAttackingFirst(player2)) {
			attacker = player1;
			defender = player2;
		} else {
			defender = player2;
			attacker = player1;
		}
	}
	
	private void swapRoles() {
		ICreature temporary = attacker;
		attacker = defender;
		defender = temporary;
	}

	private void simulateTurn() {
		attacker.attack(defender);
		swapRoles();
		if(attacker.isAlive()) {
			attacker.attack(defender);
		}
	}

	public void Play() {
		
		for(int round = 1; round <= gameClock && (attacker.isAlive() && defender.isAlive()); round++) {
			simulateTurn();
		}
	}
}
