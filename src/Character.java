
public abstract class Character {
	public static int characterId = 0;
	public int id;
	public String characterName;
	public int characterLevel;
	

	
	public Character(String name) {
		characterId++;
		this.id = characterId; 
		this.characterLevel = 1;
		this.characterName = name;
	}
	
	public Character(){
		this("");
	}
	

	public String getName() {
		return this.characterName;
	}
	
	public int getLevel() {
		return this.characterLevel;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	public int getNumberOfCharacters() {
		return characterId;
	}
	
	public abstract void levelUp();

	protected abstract int getAttack();

	protected abstract int getStrength();

	protected abstract int getDefence();

	protected abstract int getHealth();

	protected abstract int getWisdom();

	protected abstract int getIntelligence();

	protected abstract int getAccuracy();

	protected abstract int getDexterity();
	
}
