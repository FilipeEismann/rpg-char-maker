
public class Warrior extends Character{
	public int health;
	public int strength;
	public int attack;
	public int defence;
	
	public Warrior() {
		this("");
		characterId--;
	}
	
	public Warrior(String name) {
		super(name);
		this.health = 10;
		this.strength = 5;
		this.attack = 5;
		this.defence = 5;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getStrength() {
		return this.strength;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public int getDefence() {
		return this.defence;
	}
	
	public void levelUp() {
		this.characterLevel++;
		this.health = this.health + 5;
		this.strength = this.strength + 2;
		this.attack = this.attack + 2;
		this.defence = this.defence + 2;
	}
	
	public int getWisdom() {
		return 0;
	}
	
	public int getIntelligence() {
		return 0;
	}
	
	public int getAccuracy() {
		return 0;
	}
	
	public int getDexterity() {
		return 0;
	}
	
}
