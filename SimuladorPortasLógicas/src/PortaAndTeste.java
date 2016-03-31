import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PortaAndTeste {
	@Test
	public void TestaAnd11(){
		
		Switch gate = new Switch();
		PortaAnd And = new PortaAnd();
		
		InputPin PinoA = new InputPin();
		InputPin PinoB = new InputPin();
		
		And.setPinA(PinoA);
		And.setPinB(PinoB);
			
		
		gate.setOn();
		
		
		PinoA.setSource(gate);
		PinoB.setSource(gate);
		
		boolean saida = And.getOutputValue(0);
		
		Assert.assertTrue(saida);
	}
	
	

	
}
