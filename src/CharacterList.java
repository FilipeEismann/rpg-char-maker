import java.util.LinkedList;
import java.util.List;

public class CharacterList {
	/**
	 * 
	 */
	public List<Character> listOfCharacters;
	
	public CharacterList() {
		listOfCharacters = new LinkedList<Character>();
	}
	
	public List<Character> getCharacterList(){
		return listOfCharacters;
	}
	
	public void setCharacterList(List<Character> listOfCharacters) {
		this.listOfCharacters = listOfCharacters;
	}
	
	public void addCharacter(Character character) throws CharacterNotFoundException {
		if (character.getName().isBlank()){
			int size = listOfCharacters.size();
			if (size == 0) {
				Character.characterId = 0;
				throw new CharacterNotFoundException("No name declared!");
			} else {
				Character.characterId = listOfCharacters.get(size-1).id;
				throw new CharacterNotFoundException("No name declared!");
			}
		} else {
			listOfCharacters.add(character);
		}
		
	}
	
	public Character getCharacterById(int id) throws CharacterNotFoundException {
		
		if (listOfCharacters.size() == 0) {
			throw new CharacterNotFoundException("List empty!");
		} else {
			for(int i=0;i<listOfCharacters.size();i++) {
				if (listOfCharacters.get(i).id == id) {
					return listOfCharacters.get(i);
				} else if (i == (listOfCharacters.size() - 1)){
					throw new CharacterNotFoundException("Character not Found!");
				} else {
					continue;
				}
			}
		}
		return null;
	}
	
	public void removeCharacter(int id) throws CharacterNotFoundException {
		
		if (listOfCharacters.size() == 0) {
			throw new CharacterNotFoundException("List empty!");
		} else {
			for(int i=0;i<listOfCharacters.size();i++) {
				if (listOfCharacters.get(i).id == id) {
					listOfCharacters.remove(i);
				} else if (i == (listOfCharacters.size() - 1)){
					throw new CharacterNotFoundException("Character not Found!");
				} else {
					continue;
				}
			}
		}

	}
	
	
}
