package mondoFantastico;

public abstract class Character {
	private String name;
	private String clanName;
	public int lifePoints;
	//private int armorClass;
	

	public Character(String name, String clanName, int lifePoints) {
		this.name = name;
		this.clanName = clanName;
		this.lifePoints = lifePoints;
	}
	
	public int fight(int damage){
		return damage;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public String getFullName() {
		return name + " " + clanName;
	}

}
