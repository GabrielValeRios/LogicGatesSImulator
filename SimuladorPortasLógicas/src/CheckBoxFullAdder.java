import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class CheckBoxFullAdder extends JPanel implements ItemListener{
	JCheckBox aButton;
    JCheckBox bButton;
    JCheckBox cButton;
    JCheckBox lamp1CheckBox;
    JCheckBox lamp2CheckBox;
    
    StringBuffer choices;
    JLabel pictureLabel;
 
    public CheckBoxFullAdder() {
        super(new BorderLayout());
 
        //Create the check boxes.
        aButton = new JCheckBox("A");
        aButton.setMnemonic(KeyEvent.VK_C);
        aButton.setSelected(true);
 
        bButton = new JCheckBox("B");
        bButton.setMnemonic(KeyEvent.VK_G);
        bButton.setSelected(true);
        
        cButton = new JCheckBox("C");
        cButton.setMnemonic(KeyEvent.VK_H);
        cButton.setSelected(true);
        
        lamp1CheckBox = new JCheckBox("Lamp1");
        lamp1CheckBox.setMnemonic(KeyEvent.VK_H);
        lamp1CheckBox.setEnabled(false);
        
        lamp2CheckBox = new JCheckBox("Lamp2");
        lamp2CheckBox.setMnemonic(KeyEvent.VK_H);
        lamp2CheckBox.setEnabled(false);
        //Register a listener for the check boxes.
        aButton.addItemListener(this);
        bButton.addItemListener(this);
        cButton.addItemListener(this);
        
        //Indicates what's on the FullAdder.
        choices = new StringBuffer("abc");
        
        //Set up the picture label
        pictureLabel = new JLabel();
        pictureLabel.setFont(pictureLabel.getFont().deriveFont(Font.ITALIC));
        updatePicture();
        
        //Put the check boxes in a column in a panel
        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(aButton);
        checkPanel.add(bButton);
        checkPanel.add(cButton);
        checkPanel.add(lamp1CheckBox);
        checkPanel.add(lamp2CheckBox);

        add(checkPanel, BorderLayout.LINE_START);
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(60,20,20,20));
    }
    
    /** Listens to the check boxes. */
    public void itemStateChanged(ItemEvent e) {
        int index = 0;
        char c = '-';
        Object source = e.getItemSelectable();
 
        if (source == aButton) {
            index = 0;
            c = 'a';
        } else if (source == bButton) {
            index = 1;
            c = 'b';
        } else if (source == cButton) {
            index = 2;
            c = 'c';
        }

        //Now that we know which button was pushed, find out
          //whether it was selected or deselected.
          if (e.getStateChange() == ItemEvent.DESELECTED) {
              c = '-';
          }
          
          //Apply the change to the string.
          choices.setCharAt(index, c);
          
          updatePicture();
          if(aButton.isSelected() == false && bButton.isSelected() == false && cButton.isSelected()== false || 
        		  aButton.isSelected() == false && bButton.isSelected() == false && cButton.isSelected()== true ||
        		  aButton.isSelected() == false && bButton.isSelected() == true && cButton.isSelected()== false ||
        		  aButton.isSelected() == true && bButton.isSelected() == false && cButton.isSelected()== false 
        		  ){
      		lamp2CheckBox.setSelected(false);
      }else{
      	lamp2CheckBox.setSelected(true);
      }
          if(aButton.isSelected() == false && bButton.isSelected() == false && cButton.isSelected()== true || 
        		  aButton.isSelected() == false && bButton.isSelected() == true && cButton.isSelected()== false ||
        		  aButton.isSelected() == true && bButton.isSelected() == false && cButton.isSelected()== false ||
        		  aButton.isSelected() == true && bButton.isSelected() == true && cButton.isSelected()== true 
        		  ){
      		lamp1CheckBox.setSelected(true);
      }else{
      	lamp1CheckBox.setSelected(false);
      }

          
      }
    protected void updatePicture() {
        //Get the icon corresponding to the image.
        ImageIcon icon = createImageIcon(
                                    "images/fullAdder/fullAdder-"
                                    + choices.toString()
                                    + ".gif");
        pictureLabel.setIcon(icon);
        pictureLabel.setToolTipText(choices.toString());
        if (icon == null) {
            pictureLabel.setText("Missing Image");
        } else {
            pictureLabel.setText(null);
        }
    }
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = CheckBoxFullAdder.class.getResource(path);
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
        JFrame frame = new JFrame("CheckBoxFullAdder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new CheckBoxFullAdder();
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
