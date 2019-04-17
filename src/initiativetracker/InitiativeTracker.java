package initiativetracker;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.*;

public class InitiativeTracker extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JButton addButton, sortButton, advanceButton;
	
	ArrayList<Creature> initiativeList;
	
	int verticalFrameSize;
	
	public InitiativeTracker() {
		super("Initiative Tracker");
		verticalFrameSize = 150;
		setSize(200,verticalFrameSize);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout( new FlowLayout() );       
		
	    addButton = new JButton("Add Creature"); 
	    sortButton = new JButton("Sort Initiative"); 
	    advanceButton = new JButton("Advance Initiative"); 
	    
	    addButton.addActionListener(this);
	    sortButton.addActionListener(this);
	    advanceButton.addActionListener(this);
	    
	    add(addButton);
	    add(sortButton);
	    add(advanceButton);
	    
	    setVisible(true);
	    
	    initiativeList = new ArrayList<Creature>();
	}

	public static void main(String[] args) {
		InitiativeTracker tracker = new InitiativeTracker();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Add Creature")) {
			System.out.println("Adding Creature");
			verticalFrameSize += 10;
			setSize(200, verticalFrameSize);
		
			addCreature();
			
			for(int i = 0; i < initiativeList.size();i++) {
				add(initiativeList.get(i).getCreatureLabel());
			}
			
			revalidate();
			repaint();
		}
		else if(e.getActionCommand().equals("Sort Initiative")) {
			System.out.println("Sorting Initiative");
			
			for(int i = 0; i < initiativeList.size();i++) {
				remove(initiativeList.get(i).getCreatureLabel());
			}
			
			Collections.sort(initiativeList);
			
			for(int i = 0; i < initiativeList.size();i++) {
				add(initiativeList.get(i).getCreatureLabel());
			}
			
			revalidate();
			repaint();
		}
		else if(e.getActionCommand().equals("Advance Initiative")) {
			System.out.println("Advancing Initiative");
		}
	}
	
	private void addCreature() {
		
		JTextField initiative = new JTextField();
		JTextField name = new JTextField();
		JTextField hitPoints = new JTextField();
		JTextField armorClass = new JTextField();
		
		Object[] message = {
			"Initiative:", initiative,
			"Name:", name,
			"Hit Points:", hitPoints,
			"Armor Class:", armorClass
		};
		
		int option = JOptionPane.showConfirmDialog(null, message, "Add Creature", JOptionPane.OK_CANCEL_OPTION);
		
		if (option == JOptionPane.OK_OPTION) {
			initiativeList.add(new Creature(
					Integer.parseInt(initiative.getText()),
					name.getText(),
					Integer.parseInt(hitPoints.getText()),
					Integer.parseInt(armorClass.getText())));
		}
	}
}