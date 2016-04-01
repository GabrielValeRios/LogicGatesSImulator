public class Switch implements Source {
	boolean estado;

	
	@Override
	public boolean getOutputValue(int index){
		return this.estado;
		
	
	}
	
	
	public void setOutputValue(boolean a){
		this.estado = a;
		
	} 
	
	
}

		
	
	
	
		
