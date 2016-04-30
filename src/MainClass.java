
public class MainClass {
	
	public void setHitpoints(Character character){
		character.setHitPoints(character.getArmorClass()/2);
	}
	
	public boolean getAHit(Character character, Character opponent){
		if (character.getAttack()>opponent.getArmorClass()) {
			return true;
		}
		return false;
	}
	
	public Character causeDamage(Character character, Character opponent){
		if (getAHit(character, opponent)==true && character.getAttack()==20) {
			opponent.setHitPoints((opponent.getHitPoints())-2);
		}
		
		if(getAHit(character, opponent)==true) {
			opponent.setHitPoints((opponent.getHitPoints())-1);
		}
		
		System.out.println(opponent.getHitPoints());
		
		return opponent;
	}
	
	public boolean isOpponentDead(Character character, Character opponent){
		
		
		return true;
	}
}
