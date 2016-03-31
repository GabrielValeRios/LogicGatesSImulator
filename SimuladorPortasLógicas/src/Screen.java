import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	
	public Screen(){
		this.width = 100;
		this.height = 100;
		
		setPreferredSize(new Dimension(width, height));
	}
	
	public void paintComponent(Graphics g) {
			
		g.drawLine(0, 0, 0, 0);
		g.drawArc(0, 0, 0, 0, 0, 0);
			
	    

	}
			
	
	
	

}
