
abstract class LogicGate implements Source, Drain{

	
	public boolean getOutputValue(int index){
		return false;
				
	}

	public InputPin getInputPin(int index){
		return null;
		
		
	}

	public InputPin getOutputPorta(int index){
		boolean sinalout = getOutputValue(0);
		InputPin pinosaida = new InputPin();
		Switch saida = new Switch();
		
		saida.setOutputValue(sinalout);
		pinosaida.setSource(saida);
		return pinosaida;
	}
	
	
}
