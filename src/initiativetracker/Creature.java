package initiativetracker;

import javax.swing.JLabel;

public class Creature implements Comparable<Creature> {
	
	private int initiative;
	private String name;
	private int hitPoints;
	private int armorClass;
	private JLabel creatureLabel;
	
	public Creature( int initiative, String name, int hitPoints, int armorClass) {
		
		this.initiative = initiative;
		this.name = name;
		this.hitPoints = hitPoints;
		this.armorClass = armorClass;
		this.creatureLabel = new JLabel(this.toString());
	}
	
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sethitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	
	public void setCreatureLabel(JLabel creatureLabel) {
		this.creatureLabel = creatureLabel;
	}
	
	public int getInitiative() {
		return this.initiative;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHitPonts() {
		return this.hitPoints;
	}
	
	public int getArmorClass() {
		return this.armorClass;
	}
	
	public JLabel getCreatureLabel() {
		return this.creatureLabel;
	}

	@Override
	public int compareTo(Creature otherCreature) {
		return (this.getInitiative() < otherCreature.getInitiative() ? -1 : 
            (this.getInitiative() == otherCreature.getInitiative() ? 0 : 1));
	}
	
	 @Override     
	 public String toString() {         
	    return " Initiative: " + this.initiative + ", Name: " + this.name + 
	    		", Hit Points:" + this.hitPoints + ", Armor Class:" + this.armorClass;
	 }
}