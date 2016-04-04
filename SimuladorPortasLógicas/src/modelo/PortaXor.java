package modelo;
public class PortaXor extends LogicGate {
	private InputPin PinA;
	private InputPin PinB;
	
	PortaAnd And1 = new PortaAnd();
	PortaAnd And2 = new PortaAnd();
	
	InputPin pinoAnd1A = new InputPin();
	InputPin pinoAnd1B = new InputPin();
	
	InputPin pinoAnd2A = new InputPin();
	InputPin pinoAnd2B = new InputPin();
	
	PortaOr Or = new PortaOr();
	InputPin pinoOrA = new InputPin();
	InputPin pinoOrB = new InputPin();
		
	PortaNot Not1 = new PortaNot();
	PortaNot Not2 = new PortaNot();

		
	public void setPinA(InputPin pinA) {
		PinA = pinA;
	}
	public void setPinB(InputPin pinB) {
		PinB = pinB;
	}

	@Override
	public boolean getOutputValue(int index){
	    Not1.setPinA(PinA);
	    Not2.setPinA(PinB);
	    pinoAnd1A.setSource(Not1);
	    And1.setPinA(pinoAnd1A);
	    And1.setPinB(PinB);
	    And2.setPinA(PinA);
	    pinoAnd2B.setSource(Not2);
	    And2.setPinB(pinoAnd2B);
	    pinoOrA.setSource(And1);
	    Or.setPinA(pinoOrA);
	    pinoOrB.setSource(And2);
	    Or.setPinB(pinoOrB);
		
	    return Or.getOutputValue(0);
				
	}
}
