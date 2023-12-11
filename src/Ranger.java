
public class Ranger extends Character{
	public int health;
	public int accuracy;
	public int dexterity;
	public int defence;
	
	public Ranger(String name) {
		super(name);
		this.health = 10;
		this.accuracy = 5;
		this.dexterity = 5;
		this.defence = 5;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getAccuracy() {
		return this.accuracy;
	}
	
	public int getDexterity() {
		return this.dexterity;
	}
	
	public int getDefence() {
		return this.defence;
	}
	
	public void levelUp() {
		this.characterLevel++;
		this.health = this.health + 5;
		this.accuracy = this.accuracy + 2;
		this.dexterity = this.dexterity + 2;
		this.defence = this.defence + 2;
	}
	
	public int getStrength() {
		return 0;
	}
	
	public int getAttack() {
		return 0;
	}
	
	public int getWisdom() {
		return 0;
	}
	
	public int getIntelligence() {
		return 0;
	}
	
}