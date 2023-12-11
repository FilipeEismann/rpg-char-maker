
public class Wizard extends Character{
	public int health;
	public int wisdom;
	public int intelligence;
	public int defence;
	
	public Wizard(String name) {
		super(name);
		this.health = 10;
		this.wisdom = 5;
		this.intelligence = 5;
		this.defence = 5;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getWisdom() {
		return this.wisdom;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public int getDefence() {
		return this.defence;
	}
	
	public void levelUp() {
		this.characterLevel++;
		this.health = this.health + 5;
		this.wisdom = this.wisdom + 2;
		this.intelligence = this.intelligence + 2;
		this.defence = this.defence + 2;
	}
	
	public int getStrength() {
		return 0;
	}
	
	public int getAttack() {
		return 0;
	}
	
	public int getAccuracy() {
		return 0;
	}
	
	public int getDexterity() {
		return 0;
	}
	
}
