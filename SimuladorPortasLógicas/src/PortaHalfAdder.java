
public class PortaHalfAdder {

	private InputPin pinA;
	private InputPin pinB;
	
	PortaXor Xor = new PortaXor();
	InputPin pinoA = new InputPin();
	InputPin pinoB = new InputPin();
	
	PortaAnd And = new PortaAnd();
	InputPin pinoC = new InputPin();
	InputPin pinoD = new InputPin();
	
	public boolean[] getOutputValue(int index){
	    Xor.setPinA(pinA);
	    Xor.setPinB(pinB);
	    And.setPinA(pinA);
	    And.setPinB(pinB);
	    
	    boolean[] retornoHalfAdder = {Xor.getOutputValue(0),And.getOutputValue(0)};
	    return retornoHalfAdder;
		
	}
}
