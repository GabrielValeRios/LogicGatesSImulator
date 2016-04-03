import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	
	public Screen(){
		this.width = 500;
		this.height = 500;
		
		setPreferredSize(new Dimension(width, height));
	}
	
	public void paintComponent(Graphics g) {
	
		
		g.drawArc(100, 100, 90, 140, -55, 290);
		g.fillArc(100, 100, 90, 140, -55, 290);
		
		g.drawArc(33,186,90,140,0,25);
		g.drawArc(161,200,90,140,140,25);
		
		
		g.drawLine(163, 252, 163,287);
		g.drawLine(123, 257, 124,287);
		
		g.drawLine(123, 287, 165, 287);
		
		g.drawLine(133, 287, 155, 287);
		g.drawLine(155, 287, 155, 294);
		g.drawLine(133, 287, 133, 294);
		g.drawLine(133, 294, 155, 294);
		
	
		g.drawLine(150, 294, 150, 300);
		g.drawLine(138, 294, 138, 300);
		g.drawLine(138, 300, 150, 300);
		
		JComboBox combo = new JComboBox(comboboxbean);
		combo.setPreferredSize(new Dimension(285, 20));
		combo.setFont(new Font("Helvetica", Font.ROMAN_BASELINE, 13));          
		jPanel.add(combo);
		
		/*
		or
		xor
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
			
	
	
	/* 
	 * AND
	 * 	fecha o arco
		g.drawLine(150 ,300 ,150 ,400 );
Parameters:
x1 the first point's x coordinate.
y1 the first point's y coordinate.
x2 the second point's x coordinate.
y2 the second point's y coordinate.

		//arco
		g.drawArc(100,300, 100, 100, -90, 180);
		//perna de cima
		g.drawLine(110 ,320 ,150 ,320 );
		//perna de baixo
		g.drawLine(110 ,380 ,150 ,380 );
		//saida
		g.drawLine(200 ,350 ,240 ,350 );
	 */


/*
 NOT
 
//fecha o arco
		g.drawLine(150 ,300 ,150 ,400 );

		//bolinha
		g.drawArc(240,345, 10, 10, -90, 360);
		
		//perna de cima
		g.drawLine(110 ,350 ,150 ,350 );

		
		//saida
		g.drawLine(250 ,350 ,280 ,350 );
		
		//parte cima triangulo
		g.drawLine(150 ,300 ,240 ,350 );
		//parte baixo triangulo
		g.drawLine(150 ,400 ,240 ,350 );
*/
/*
 
HALF ADDER
//topo do quadrado
g.drawLine(100, 150, 300, 150);
//lado direito quadrado
g.drawLine(300, 150, 300, 350);
//Baixo quadrado
g.drawLine(300, 350, 100, 350);
//lado esquerdo do quadrado
g.drawLine(100, 350, 100, 150);
//nome e sua posição
g.drawString("HALF ADDER",160,250);
//saida do topo
g.drawLine(300, 200, 350, 200);
//saida de baixo
g.drawLine(300, 300, 350, 300);
//entrada do topo
g.drawLine(100, 200, 50, 200);
//entrada de baixo
g.drawLine(100, 300, 50, 300);
*/

/*
ADDER
//topo do quadrado
		g.drawLine(100, 150, 300, 150);
		//entrada topo1
		g.drawLine(155, 150, 155, 100);
		//entrada topo2
		g.drawLine(245, 150, 245, 100);
		//lado direito quadrado
		g.drawLine(300, 150, 300, 350);
		//Baixo quadrado
		g.drawLine(300, 350, 100, 350);
		//entrada baixo 
		g.drawLine(200, 350, 200, 400);
		//lado esquerdo do quadrado
		g.drawLine(100, 350, 100, 150);
		//nome e sua posição
		g.drawString("ADDER",180,250);
		//saida 
		g.drawLine(300, 250, 350, 250);
	
		//entrada 
		g.drawLine(100, 250, 50, 250);
*/


/* 
LAMPADA
g.drawArc(100, 100, 90, 140, -55, 290);
//g.fillArc(100, 100, 90, 140, -55, 290);

g.drawArc(33,186,90,140,0,25);
g.drawArc(161,200,90,140,140,25);


g.drawLine(163, 252, 163,287);
g.drawLine(123, 257, 124,287);

g.drawLine(123, 287, 165, 287);

g.drawLine(133, 287, 155, 287);
g.drawLine(155, 287, 155, 294);
g.drawLine(133, 287, 133, 294);
g.drawLine(133, 294, 155, 294);


g.drawLine(150, 294, 150, 300);
g.drawLine(138, 294, 138, 300);
g.drawLine(138, 300, 150, 300);
*/