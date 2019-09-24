package mondoFantastico;

public class Character {
	private String name;
	private String clanName;
	private int lifePoints;
	private int armorClass;
	
	public Character(String name, String clanName, int lifePoints, int armorClass) {
		this.name = name;
		this.clanName = clanName;
		this.lifePoints = lifePoints;
		this.armorClass = armorClass;
	}
	
	@Override
	public String toString() {
		return name + " " + clanName + " with " + lifePoints + " life points and " + armorClass + "armor class.";
	}

}
