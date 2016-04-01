
public class PortaXor extends LogicGate {
	private InputPin PinA;
	private InputPin PinB;
	public void setPinA(InputPin pinA) {
		PinA = pinA;
	}
	public void setPinB(InputPin pinB) {
		PinB = pinB;
	}
	
	@Override
	public boolean getOutputValue(int index){
		PortaNot Not = new PortaNot();
		PortaAnd And = new PortaAnd();
		PortaOr Or = new PortaOr();
		
		
	}
}
