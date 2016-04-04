import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo extends JPanel implements ActionListener{
	 JLabel picture;
	 
	 	CheckBoxOr or;
	 	CheckBoxNot not;
	 	CheckBoxAnd and;
	 	CheckBoxXor xor;
	 	CheckBoxHalfAdder halfAdder;
	 	CheckBoxFullAdder fullAdder;
	 	JPanel tmp;
	 	
	    public ComboBoxDemo() {
	        super(new BorderLayout());
	 
	        or = new CheckBoxOr();
	        not = new CheckBoxNot();
	        and = new CheckBoxAnd();
	        xor = new CheckBoxXor();
	        halfAdder = new CheckBoxHalfAdder();
	        fullAdder = new CheckBoxFullAdder();
	        tmp = new JPanel();
	        
	        tmp.add(or);
	        
	        String[] gateStrings = { "Not", "And", "Or", "And", "Xor", "HalfAdder", "FullAdder"};
	 
	        //Create the combo box, select the item at index 6.
	        //Indices start at 0, so 4 specifies the FullAdder.
	        JComboBox gateList = new JComboBox(gateStrings);
	        gateList.setSelectedIndex(6);
	        gateList.addActionListener(this);
	 
	        //Set up the picture.
	        picture = new JLabel();
	        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
	        picture.setHorizontalAlignment(JLabel.CENTER);
	        updateLabel(gateStrings[gateList.getSelectedIndex()]);
	        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
	 
	        //The preferred size is hard-coded to be the width of the
	        //widest image and the height of the tallest image + the border.
	        //A real program would compute this.
	        picture.setPreferredSize(new Dimension(377, 122+10));
	 
	        //Lay out the demo.
	        add(gateList, BorderLayout.NORTH);
	        //add(picture, BorderLayout.SOUTH);
	        add(tmp,BorderLayout.WEST);
	        
	        setBorder(BorderFactory.createEmptyBorder(60,20,20,20));
	    }
	 
	    /** Listens to the combo box. */
	    public void actionPerformed(ActionEvent e) {
	        JComboBox cb = (JComboBox)e.getSource();
	        String petName = (String)cb.getSelectedItem();
	        updateLabel(petName);
	    }
	 
	    protected void updateLabel(String name) {
	    	if(name=="Or") {
	            tmp.removeAll();
	            tmp.add(or);
	            validate();
	            repaint();
	            setVisible(true);
	    	}else if(name=="Not") {
	            tmp.removeAll();
	            tmp.add(not);
	            validate();
	            repaint();
	            setVisible(true);
	    	}else if(name=="And") {
	            tmp.removeAll();
	            tmp.add(and);
	            validate();
	            repaint();
	            setVisible(true);
	    	}else if(name=="Xor") {
	            tmp.removeAll();
	            tmp.add(xor);
	            validate();
	            repaint();
	            setVisible(true);
	    	}else if(name=="HalfAdder") {
	            tmp.removeAll();
	            tmp.add(halfAdder);
	            validate();
	            repaint();
	            setVisible(true);
	    	}else if(name=="FullAdder") {
	            tmp.removeAll();
	            tmp.add(fullAdder);
	            validate();
	            repaint();
	            setVisible(true);
	    	}else {
	    		ImageIcon icon = createImageIcon("images/" + name + "---.gif");
	    		picture.setIcon(icon);
	    		picture.setToolTipText("A drawing of a " + name.toLowerCase());
	    		if (icon != null) {
	    			picture.setText(null);
	    		} else {
	    			picture.setText("Image not found");
	    		}
	  	    }
	    }
	 
	    /** Returns an ImageIcon, or null if the path was invalid. */
	    protected static ImageIcon createImageIcon(String path) {
	        java.net.URL imgURL = ComboBoxDemo.class.getResource(path);
	        if (imgURL != null) {
	            return new ImageIcon(imgURL);
	        } else {
	            System.err.println("Couldn't find file: " + path);
	            return null;
	        }
	    }
	 
	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     */
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("ComboBoxDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        JComponent newContentPane = new ComboBoxDemo();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	 
	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }

}
