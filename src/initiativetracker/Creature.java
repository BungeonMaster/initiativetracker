package initiativetracker;

public class Creature {
	
	private String name;
	private int hitPoints;
	private int initiative;
	
	public Creature(String name, int hitPoints, int initiative) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.initiative = initiative;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sethitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHitPonts() {
		return this.hitPoints;
	}
	
	public int getInitiative() {
		return this.initiative;
	}
}
