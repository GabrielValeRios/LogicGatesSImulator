package modelo;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class PortaXorTeste {
	
		@Test
		public void TestaXor11(){
			
			Switch gate = new Switch();
			PortaXor Xor = new PortaXor();
			
			InputPin PinoA = new InputPin();
			InputPin PinoB = new InputPin();
			
			Xor.setPinA(PinoA);
			Xor.setPinB(PinoB);
				
			
			gate.setOutputValue(true);
			
			
			PinoA.setSource(gate);
			PinoB.setSource(gate);
			
			boolean saida = Xor.getOutputValue(0);
			
			Assert.assertFalse(saida);
	   }

		@Test
		public void TestaXor00(){
			
			Switch gate = new Switch();
			PortaXor Xor = new PortaXor();
			
			InputPin PinoA = new InputPin();
			InputPin PinoB = new InputPin();
			
			Xor.setPinA(PinoA);
			Xor.setPinB(PinoB);
				
			
			gate.setOutputValue(false);
			
			
			PinoA.setSource(gate);
			PinoB.setSource(gate);
			
			boolean saida = Xor.getOutputValue(0);
			
			Assert.assertFalse(saida);
	   }
		@Test
		public void TestaXor10(){
						
				Switch gate = new Switch();
				Switch gate2 = new Switch();
				PortaXor Xor = new PortaXor();
				
				InputPin PinoA = new InputPin();
				InputPin PinoB = new InputPin();
				
				Xor.setPinA(PinoA);
				Xor.setPinB(PinoB);
					
				
				gate.setOutputValue(true);
				gate2.setOutputValue(false);
				
				PinoA.setSource(gate);
				PinoB.setSource(gate2);
				
				boolean saida = Xor.getOutputValue(0);
				
				Assert.assertTrue(saida);
		}
				
		@Test
		public void TestaXor01(){
						
				Switch gate = new Switch();
				Switch gate2 = new Switch();
				PortaOr Xor = new PortaOr();
				
				InputPin PinoA = new InputPin();
				InputPin PinoB = new InputPin();
				
				Xor.setPinA(PinoA);
				Xor.setPinB(PinoB);
					
				
				gate.setOutputValue(false);
				gate2.setOutputValue(true);
				
				PinoA.setSource(gate);
				PinoB.setSource(gate2);
				
				boolean saida = Xor.getOutputValue(0);
				
				Assert.assertTrue(saida);
			}
	}





