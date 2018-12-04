package statePatternChar;

public class Character {  ////what you refer to as the context
	
	charState healthy;
	charState wounded;
	charState carryingTooMuch;
	
	charState CHARstate;
	
	int characterHealth = 400;
	boolean tooMuchLoot = false;
	
	public Character() {
		healthy = new Healthy(this);
		wounded = new Wounded(this);
		carryingTooMuch = new CarryingTooMuch(this);
		
		CharacterState = healthy;
		
		if(characterHealth == 0) {
			CharacterState = "You are dead.";
		}
		
		void setCharacterState(CharacterState newCharacterState) {
			CharacterState = new CharacterState;
		}
		public void set
	}

}
