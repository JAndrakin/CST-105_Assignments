import javax.swing.JApplet;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Draft extends JApplet {

	/**
	 * Create the applet.
	 */
	public Draft() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPickPlayers = new JButton("Pick Players");
		getContentPane().add(btnPickPlayers);
		
		JLabel lblNflDraft = new JLabel("NFL DRAFT");
		getContentPane().add(lblNflDraft);
		
		JButton btnViewSelection = new JButton("View Selection");
		getContentPane().add(btnViewSelection);

		
		HandlerClass handler = new HandlerClass();
		btnPickPlayers.addActionListener(handler);
		
	}
	
	private class HandlerClass implements ActionListener 

}
