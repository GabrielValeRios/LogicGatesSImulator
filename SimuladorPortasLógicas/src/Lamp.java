public class Lamp implements Drain {
	
	private InputPin pinL;
	
	@Override
	public InputPin getInputPin(int index){
		boolean sinalL = pinL.getSource().getOutputValue(pinL.getIndex());
		if(sinalL == true){
		   pinL.getInputPin(index);
		}
	}
	
}
