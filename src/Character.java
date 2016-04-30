
public class Character {
	private String name;
	private String alignment;
	private int armorClass;
	private int hitPoints;
	private int attack;
	private int damage;
	private int ability;
	
	public Character(){
	}
	public Character(String name, String alignment, int armorClass, int hitPoints, int attack, int damage,
			int ability) {
		super();
		this.name = name;
		this.alignment = alignment;
		this.armorClass = armorClass;
		this.hitPoints = hitPoints;
		this.attack = attack;
		this.damage = damage;
		this.ability = ability;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public int getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getAbility() {
		return ability;
	}
	public void setAbility(int ability) {
		this.ability = ability;
	}
}
