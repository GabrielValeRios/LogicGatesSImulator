
public class PortaHalfAdder {

	private InputPin pinA;
	private InputPin pinB;
	
	
	
	public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}


	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}


	PortaXor Xor = new PortaXor();

	
	PortaAnd And = new PortaAnd();

	
	public boolean[] getOutputValue(int index){
	    Xor.setPinA(pinA);
	    Xor.setPinB(pinB);
	    And.setPinA(pinA);
	    And.setPinB(pinB);
	    
	    boolean[] retornoHalfAdder = {Xor.getOutputValue(0),And.getOutputValue(0)};
	    return retornoHalfAdder;
		
	}
}
