package eastereggs.testing;

import java.util.ArrayList;

import eastereggs.builders.DefaultGridBuilder;
import eastereggs.builders.DefaultRabbitBuilder;
import eastereggs.gameplay.business.ISimulate;
import eastereggs.gameplay.business.Simulate;
import eastereggs.service.IGrid;
import eastereggs.service.IRabbit;

public class test {

	public static void main(String[] args) {
		DefaultGridBuilder gridBuilder = new DefaultGridBuilder();
		IGrid iGrid = gridBuilder.getResult();
		
		DefaultRabbitBuilder rabbitBuilder = new DefaultRabbitBuilder();
		rabbitBuilder.setGrid(iGrid);
		
		ArrayList<IRabbit> iRabbits = new ArrayList<IRabbit>();
		iRabbits.add(rabbitBuilder.getResult());
		
		ISimulate iSimulate = new Simulate(iRabbits);
		
		iSimulate.simulate();
	}

}
