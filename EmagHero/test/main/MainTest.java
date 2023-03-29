package EmagHero.test.main;

import EmagHero.gameplay.GameLoop;
import EmagHero.service.builder.CreatureBuilder;
import EmagHero.service.builder.HeroBuilder;
import EmagHero.service.creature.Hero;
import EmagHero.service.creature.Monster;

public class MainTest {

	public static void main(String[] args) {
		
		HeroBuilder heroBuilder = new HeroBuilder();
		
		heroBuilder.setRandomHealth(60, 90);
		heroBuilder.setRandomStrength(60, 90);
		heroBuilder.setRandomSpeed(40, 60);
		heroBuilder.setRandomLuck(25, 40);
		
		heroBuilder.setSpellLuck(20);
		heroBuilder.setRandomDefense(40, 60);
		heroBuilder.setSpellLuck(10);
		heroBuilder.setRapidStrike();
		
		Hero hero = heroBuilder.getResult();
		
		
		CreatureBuilder monsterBuilder = new CreatureBuilder();
		
		monsterBuilder.setRandomHealth(60, 90);
		monsterBuilder.setRandomStrength(60, 90);
		monsterBuilder.setRandomDefense(40, 60);
		monsterBuilder.setRandomSpeed(40, 60);
		monsterBuilder.setRandomLuck(25, 40);
		
		Monster monster = monsterBuilder.getResult();
		
		// GameClock
		GameLoop gameLoop = new GameLoop(20, hero, monster);
		
		gameLoop.Play();
	}

}
