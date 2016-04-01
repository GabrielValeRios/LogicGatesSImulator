import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PortaNotTeste {
	public class PortaAndTeste {
		@Test
		public void TestaNot0(){
			
			Switch gate = new Switch();
			PortaNot Not = new PortaNot();
			
			InputPin PinoNot= new InputPin();
						
			Not.setPinA(PinoNot);
						
			
			gate.setOutputValue(true);
			
			
			PinoNot.setSource(gate);
						
			boolean saida = Not.getOutputValue(0);
			
			Assert.assertFalse(saida);
		}
		
		@Test
		public void TestaNot1(){
			
			Switch gate = new Switch();
			PortaNot Not = new PortaNot();
			
			InputPin PinoNot= new InputPin();
						
			Not.setPinA(PinoNot);
						
			
			gate.setOutputValue(false);
			
			
			PinoNot.setSource(gate);
						
			boolean saida = Not.getOutputValue(0);
			
			Assert.assertTrue(saida);
		}
	}	
}
