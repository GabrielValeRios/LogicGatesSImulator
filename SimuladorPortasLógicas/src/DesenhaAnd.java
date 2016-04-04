
public class DesenhaAnd extends JPanel{
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Graphics;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
		
		
	public void DesenhAnd(){
			this.width = 500;
			this.height = 500;
	}

			
			setPreferredSize(new Dimension(width, height))
		
		public void paintComponent(Graphics g) {
				
			g.drawLine(10, 5, 70, 5);
			g.drawArc(10,300, 50, 50, 0, 180);
			
			/*
			and
			or
			not
			xor
			half adder
			adder
			lampada(acessa e apagada)
			*/
			
			/*botão
			 switch (check)
			  */
			
			/*
			Parameters:
			x the x coordinate of the upper-left corner of the arc to be drawn.
			y the y coordinate of the upper-left corner of the arc to be drawn.
			width the width of the arc to be drawn.
			height the height of the arc to be drawn.
			startAngle the beginning angle.
			arcAngle the angular extent of the arc, relative to the start angle.
			*/
				
		    
			
			getToolkit().sync();
		}
}