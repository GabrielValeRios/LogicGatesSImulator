package visao;
import javax.swing.JFrame;

public class TestaScreen {

	
public static void main(String[] args) {
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

      
            	Screen screen = new Screen();

            	JFrame frame = new JFrame("Porta Lógica");

            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
            	frame.setResizable(false);

            	frame.setContentPane(screen);

            	frame.pack();
                frame.setVisible(true);
            }
        });
	}
}
	

