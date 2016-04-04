package modelo;
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
			
		
		gate.setOutputValue(true);
		
		
		PinoA.setSource(gate);
		PinoB.setSource(gate);
		
		boolean saida = And.getOutputValue(0);
		
		Assert.assertTrue(saida);
}
	@Test
	public void TestaAnd00(){
			
			Switch gate = new Switch();
			PortaAnd And = new PortaAnd();
			
			InputPin PinoA = new InputPin();
			InputPin PinoB = new InputPin();
			
			And.setPinA(PinoA);
			And.setPinB(PinoB);
				
			
			gate.setOutputValue(false);
			
			
			PinoA.setSource(gate);
			PinoB.setSource(gate);
			
			boolean saida = And.getOutputValue(0);
			
			Assert.assertFalse(saida);
	}
	@Test
	public void TestaAnd10(){
					
			Switch gate = new Switch();
			Switch gate2 = new Switch();
			PortaAnd And = new PortaAnd();
			
			InputPin PinoA = new InputPin();
			InputPin PinoB = new InputPin();
			
			And.setPinA(PinoA);
			And.setPinB(PinoB);
				
			
			gate.setOutputValue(true);
			gate2.setOutputValue(false);
			
			PinoA.setSource(gate);
			PinoB.setSource(gate2);
			
			boolean saida = And.getOutputValue(0);
			
			Assert.assertFalse(saida);
}
			
	@Test
	public void TestaAnd01(){
					
			Switch gate = new Switch();
			Switch gate2 = new Switch();
			PortaAnd And = new PortaAnd();
			
			InputPin PinoA = new InputPin();
			InputPin PinoB = new InputPin();
			
			And.setPinA(PinoA);
			And.setPinB(PinoB);
				
			
			gate.setOutputValue(false);
			gate2.setOutputValue(true);
			
			PinoA.setSource(gate);
			PinoB.setSource(gate2);
			
			boolean saida = And.getOutputValue(0);
			
			Assert.assertFalse(saida);
	}
}
	
	

	

