import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
// Código para desenhar portas lógicas
public class Screen extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	
	public Screen(){
		this.width = 500; // tamanho de janela
		this.height = 500; 
		
		setPreferredSize(new Dimension(width, height));
	}
	
	public void paintComponent(Graphics g) {
			
		g.drawLine(0,0,0,0); // Desenhar linhas
		g.drawLine(10, 5, 70, 5); // Desenhar arcos
		g.drawArc(0, 0, 0, 0, 0, 0);
			
	    
		
		getToolkit().sync();
	}
}	
			
	
	
	


