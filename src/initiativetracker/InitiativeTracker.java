package initiativetracker;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InitiativeTracker extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JPanel panel;
	JLabel label;
	
	public InitiativeTracker() {
		super("Initiative Tracker");
		setSize(150,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout( new FlowLayout() );       // set the layout manager
	    label = new JLabel("Hello Swing!");  // construct a JLabel
	    add( label ); 
	    setVisible(true);
	}

	public static void main(String[] args) {
		InitiativeTracker tracker = new InitiativeTracker();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
