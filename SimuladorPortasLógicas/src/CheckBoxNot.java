
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CheckBoxNot  extends JPanel implements ItemListener{
	JCheckBox switchButton;
	
    StringBuffer choices;
    JLabel pictureLabel;
 
    public CheckBoxNot() {
        super(new BorderLayout());
 
        //Create the check boxes.
        switchButton = new JCheckBox("Switch");
        switchButton.setMnemonic(KeyEvent.VK_C);
        switchButton.setSelected(true);
        
        //Register a listener for the check boxes.
        switchButton.addItemListener(this);
        
        
        //Indicates what's on the not.
        choices = new StringBuffer("o");
 
        //Set up the picture label
        pictureLabel = new JLabel();
        pictureLabel.setFont(pictureLabel.getFont().deriveFont(Font.ITALIC));
        updatePicture();
        
        //Put the check boxes in a column in a panel
        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(switchButton);
        
        add(checkPanel, BorderLayout.LINE_START);
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(40,20,20,20));
    }
    
    /** Listens to the check boxes. */
    public void itemStateChanged(ItemEvent e) {
        int index = 0;
        char c = '-';
        Object source = e.getItemSelectable();
 
        if (source == switchButton) {
            index = 0;
            c = 'o';
        }
        
        //Now that we know which button was pushed, find out
        //whether it was selected or deselected.
        if (e.getStateChange() == ItemEvent.DESELECTED) {
            c = '-';
        }
 
        //Apply the change to the string.
        choices.setCharAt(index, c);
 
        updatePicture();
    }
    
    protected void updatePicture() {
        //Get the icon corresponding to the image.
        ImageIcon icon = createImageIcon(
                                    "images/not/not-"
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
        java.net.URL imgURL = CheckBoxNot.class.getResource(path);
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
        JFrame frame = new JFrame("CheckBoxNot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new CheckBoxNot();
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
