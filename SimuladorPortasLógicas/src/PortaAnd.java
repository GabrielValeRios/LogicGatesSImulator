
public class PortaAnd extends LogicGate{
	private InputPin pinA ;
	private InputPin pinB ;
	
	InputPin PinoA = new InputPin();
	InputPin PinoB = new InputPin();
	
	
	public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}



	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}



	@Override
	public boolean getOutputValue(int index){
		boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
		boolean sinalB = pinB.getSource().getOutputValue(pinB.getIndex());
		return sinalA && sinalB;
	}

}
