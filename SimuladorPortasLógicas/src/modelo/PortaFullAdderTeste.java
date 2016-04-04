package modelo;
import org.junit.Assert;
import org.junit.Test;

public class PortaFullAdderTeste {
	@Test
	public void TestaFullAdder000(){
		
		Switch gate = new Switch();
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate.setOutputValue(false);
		
		
		PinoSoma1.setSource(gate);
		PinoSoma2.setSource(gate);
		PinoResto.setSource(gate);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertFalse(saida1);
		Assert.assertFalse(saida2);
	}
	@Test
	public void TestaFullAdder111(){
		
		Switch gate = new Switch();
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate.setOutputValue(true);
		
		
		PinoSoma1.setSource(gate);
		PinoSoma2.setSource(gate);
		PinoResto.setSource(gate);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertTrue(saida1);
		Assert.assertTrue(saida2);
	}
	@Test
	public void TestaFullAdder100(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();
		
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate1.setOutputValue(true);
		gate2.setOutputValue(false);
		
		
		
		PinoSoma1.setSource(gate1);
		PinoSoma2.setSource(gate2);
		PinoResto.setSource(gate2);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertTrue(saida1);
		Assert.assertFalse(saida2);
	}
	@Test
	public void TestaFullAdder110(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();
		
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate1.setOutputValue(true);
		gate2.setOutputValue(false);
		
		
		
		PinoSoma1.setSource(gate1);
		PinoSoma2.setSource(gate1);
		PinoResto.setSource(gate2);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertFalse(saida1);
		Assert.assertTrue(saida2);
	}
	@Test
	public void TestaFullAdder101(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();
		
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate1.setOutputValue(true);
		gate2.setOutputValue(false);
		
		
		
		PinoSoma1.setSource(gate1);
		PinoSoma2.setSource(gate2);
		PinoResto.setSource(gate1);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertFalse(saida1);
		Assert.assertTrue(saida2);
	}
	@Test
	public void TestaFullAdder010(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();
		
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate1.setOutputValue(true);
		gate2.setOutputValue(false);
		
		
		
		PinoSoma1.setSource(gate2);
		PinoSoma2.setSource(gate1);
		PinoResto.setSource(gate2);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertTrue(saida1);
		Assert.assertFalse(saida2);
	}
	@Test
	public void TestaFullAdder011(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();
		
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate1.setOutputValue(true);
		gate2.setOutputValue(false);
		
		
		
		PinoSoma1.setSource(gate2);
		PinoSoma2.setSource(gate1);
		PinoResto.setSource(gate1);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertFalse(saida1);
		Assert.assertTrue(saida2);
	}
	@Test
	public void TestaFullAdder001(){
		
		Switch gate1 = new Switch();
		Switch gate2 = new Switch();
		
		PortaFullAdder FullAdder = new PortaFullAdder();
		
		InputPin PinoSoma1 = new InputPin();
		InputPin PinoSoma2 = new InputPin();
		InputPin PinoResto = new InputPin();
		
		FullAdder.setPinA(PinoSoma1);
		FullAdder.setPinB(PinoSoma2);
		FullAdder.setPinC(PinoResto);	
		
		gate1.setOutputValue(true);
		gate2.setOutputValue(false);
		
		
		
		PinoSoma1.setSource(gate2);
		PinoSoma2.setSource(gate2);
		PinoResto.setSource(gate1);			
		
		boolean saida1 = FullAdder.getOutputValue(0)[0];
		boolean saida2 = FullAdder.getOutputValue(1)[1];
		Assert.assertTrue(saida1);
		Assert.assertFalse(saida2);
	}
}
