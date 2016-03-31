public class Switch implements Source {
	boolean estado;

	
	@Override
	public boolean getOutputValue(int index){
		return this.estado;
		
	
	}
	
	
	public void setOn(){
		this.estado = true;
	}
	
	public void setOff(){
		this.estado = false;
	}
	
	
}

		
	
	
	
		
