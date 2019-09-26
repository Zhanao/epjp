package mondoFantastico;

public abstract class Character {
	private String name;
	private String clanName;
	public int lifePoints;
	public int armorClass;
	

	public Character(String name, String clanName, int lifePoints, int armorClass) {
		this.name = name;
		this.clanName = clanName;
		this.lifePoints = lifePoints;
		this.armorClass = armorClass;
	}
	
	public int dice(int faces) {
		int result = (int) Math.round(Math.random()*(faces - 1) + 1);
		return result;
	}
	
	public int fight(int diceFighter, int armorDefender){
		int damage = 0;
		if (dice(20) > armorDefender) {
			damage = dice(diceFighter);
			System.out.println("The offencer hits and caused " + damage + " of damage.");
		} else {
			System.out.println("The offencer tries to hit but missed the opponent.");
		}
		return damage;
	}
	
//	public int armor(int defence) {
//		
//	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	
	public int getArmorClass() {
		return armorClass;
	}
	
	public String getFullName() {
		return name + " " + clanName;
	}
	
	public String getFullNameAndStats() {
    	return "The complete name is " + name + " " + clanName + " and the life points are " + lifePoints;
	}

}
