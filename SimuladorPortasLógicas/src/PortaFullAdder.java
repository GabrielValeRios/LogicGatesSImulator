
public class PortaFullAdder {

	InputPin pinA;
	InputPin pinB;
	InputPin pinc;
	
	PortaXor Xor1 = new PortaXor();
	PortaXor Xor2 = new PortaXor();
	InputPin PinoXor2A = new InputPin();
	InputPin PinoXor2B = new InputPin();
	PortaAnd And1 = new PortaAnd();
	InputPin PinoOrA = new InputPin();
	InputPin PinoOrB = new InputPin();
	PortaAnd And2 = new PortaAnd();
	PortaOr  Or   = new PortaOr();
	
	
	public boolean[] getOutputValue(int index){
		Xor1.setPinA(pinA);
		Xor1.setPinB(pinB);
		
		PinoXor2A.setSource(Xor1);
		Xor2.setPinA(PinoXor2A);
		Xor2.setPinB(pinc);
		
		And2.setPinA(pinB);
		And2.setPinB(pinA);
		
		And1.setPinA(pinc);
		And1.setPinB(PinoXor2A);
		
		PinoOrA.setSource(And1);
		PinoOrB.setSource(And2);
		Or.setPinA(PinoOrA);
		Or.setPinB(PinoOrB);
		
		boolean [] retornoFullAdder = {Xor2.getOutputValue(0),Or.getOutputValue(0)};
		return retornoFullAdder;
	}	
}
