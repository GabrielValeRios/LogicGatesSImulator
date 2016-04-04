

import org.junit.Assert;
import org.junit.Test;

public class PortaHalfAdderTeste {
	@Test
	public void TestaHalfAdder00(){
		
		Switch gate = new Switch();
		PortaHalfAdder HalfAdder = new PortaHalfAdder();
		
		InputPin PinoSoma = new InputPin();
		InputPin PinoResto = new InputPin();
		
		HalfAdder.setPinA(PinoSoma);
		HalfAdder.setPinB(PinoResto);	
		
		gate.setOutputValue(false);
		
		
		PinoSoma.setSource(gate);
		PinoResto.setSource(gate);			
		
		boolean saida1 = HalfAdder.getOutputValue(0)[0];
		boolean saida2 = HalfAdder.getOutputValue(1)[1];
		Assert.assertFalse(saida1);
		Assert.assertFalse(saida2);
	}
	
	@Test
	public void TestaHalfAdder11(){
		
		Switch gate = new Switch();
		PortaHalfAdder HalfAdder = new PortaHalfAdder();
		
		InputPin PinoSoma = new InputPin();
		InputPin PinoResto = new InputPin();
		
		HalfAdder.setPinA(PinoSoma);
		HalfAdder.setPinB(PinoResto);	
		
		gate.setOutputValue(true);
		
		
		PinoSoma.setSource(gate);
		PinoResto.setSource(gate);			
		
		boolean saida1 = HalfAdder.getOutputValue(0)[0];
		boolean saida2 = HalfAdder.getOutputValue(1)[1];
		Assert.assertFalse(saida1);
		Assert.assertTrue(saida2);
	}

	@Test
	public void TestaHalfAdder01(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();

		PortaHalfAdder HalfAdder = new PortaHalfAdder();
		
		InputPin PinoSoma = new InputPin();
		InputPin PinoResto = new InputPin();
		
		HalfAdder.setPinA(PinoSoma);
		HalfAdder.setPinB(PinoResto);	
		
		gate1.setOutputValue(false);
		gate2.setOutputValue(true);
		
		PinoSoma.setSource(gate1);
		PinoResto.setSource(gate2);			
		
		boolean saida1 = HalfAdder.getOutputValue(0)[0];
		boolean saida2 = HalfAdder.getOutputValue(1)[1];
		Assert.assertTrue(saida1);
		Assert.assertFalse(saida2);
	}
	@Test
	public void TestaHalfAdder10(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();

		PortaHalfAdder HalfAdder = new PortaHalfAdder();
		
		InputPin PinoSoma = new InputPin();
		InputPin PinoResto = new InputPin();
		
		HalfAdder.setPinA(PinoSoma);
		HalfAdder.setPinB(PinoResto);	
		
		gate1.setOutputValue(false);
		gate2.setOutputValue(true);
		
		PinoSoma.setSource(gate1);
		PinoResto.setSource(gate2);			
		
		boolean saida1 = HalfAdder.getOutputValue(0)[0];
		boolean saida2 = HalfAdder.getOutputValue(1)[1];
		Assert.assertTrue(saida1);
		Assert.assertFalse(saida2);
    }
}
