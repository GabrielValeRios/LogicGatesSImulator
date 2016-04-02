
public class PortaXor extends LogicGate {
	private InputPin PinA;
	private InputPin PinB;
	
	PortaAnd And = new PortaAnd();
	InputPin pinoA = new InputPin();
	InputPin pinoB = new InputPin();
	boolean sinalAnd = And.getOutputValue(0);
	
	PortaOr Or = new PortaOr();
	InputPin pinoC = new InputPin();
	InputPin pinoD = new InputPin();
	boolean sinalOr = Or.getOutputValue(0);
	
	PortaNot Not = new PortaNot();
	InputPin pinoE = new InputPin();
	boolean sinalNot = Not.getOutputValue(0);
	
	public void setPinA(InputPin pinA) {
		PinA = pinA;
	}
	public void setPinB(InputPin pinB) {
		PinB = pinB;
	}
	
	@Override
	public boolean getOutputValue(int index){
		boolean sinalfinal = Or.getOutputValue(0);
		
		
		
		
	}
}
