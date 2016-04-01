import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class PortaOrTeste {
	
		@Test
		public void TestaOr11(){
			
			Switch gate = new Switch();
			PortaAnd Or = new PortaAnd();
			
			InputPin PinoA = new InputPin();
			InputPin PinoB = new InputPin();
			
			Or.setPinA(PinoA);
			Or.setPinB(PinoB);
				
			
			gate.setOutputValue(true);
			
			
			PinoA.setSource(gate);
			PinoB.setSource(gate);
			
			boolean saida = Or.getOutputValue(0);
			
			Assert.assertTrue(saida);
	   }

		@Test
		public void TestaOr00(){
			
			Switch gate = new Switch();
			PortaAnd Or = new PortaAnd();
			
			InputPin PinoA = new InputPin();
			InputPin PinoB = new InputPin();
			
			Or.setPinA(PinoA);
			Or.setPinB(PinoB);
				
			
			gate.setOutputValue(false);
			
			
			PinoA.setSource(gate);
			PinoB.setSource(gate);
			
			boolean saida = Or.getOutputValue(0);
			
			Assert.assertFalse(saida);
	   }
		@Test
		public void TestaOr10(){
						
				Switch gate = new Switch();
				Switch gate2 = new Switch();
				PortaOr Or = new PortaOr();
				
				InputPin PinoA = new InputPin();
				InputPin PinoB = new InputPin();
				
				Or.setPinA(PinoA);
				Or.setPinB(PinoB);
					
				
				gate.setOutputValue(true);
				gate2.setOutputValue(false);
				
				PinoA.setSource(gate);
				PinoB.setSource(gate2);
				
				boolean saida = Or.getOutputValue(0);
				
				Assert.assertTrue(saida);
		}
				
		@Test
		public void TestaOr01(){
						
				Switch gate = new Switch();
				Switch gate2 = new Switch();
				PortaOr Or = new PortaOr();
				
				InputPin PinoA = new InputPin();
				InputPin PinoB = new InputPin();
				
				Or.setPinA(PinoA);
				Or.setPinB(PinoB);
					
				
				gate.setOutputValue(false);
				gate2.setOutputValue(true);
				
				PinoA.setSource(gate);
				PinoB.setSource(gate2);
				
				boolean saida = Or.getOutputValue(0);
				
				Assert.assertTrue(saida);
			}
	}





