package mondoFantastico;

public abstract class Character {
	public String name;
	public String clanName;
	public int lifePoints = 10 + multipleDices(10, 10);
	public int bonusDex = dice(7) - 2;
	public int armorClass = 10 + bonusDex;

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
	
	public int multipleDices(int faces, int times) {
		int result = 0;
		for (int i = 0; i < times; i++) {
			result += (int) Math.round(Math.random()*(faces - 1) + 1);
		}
		return result;
	}
	
	public int fight(int diceFighter, int armorDefender){
		int damage = 0;
		if (dice(20) > armorDefender) {
			damage = dice(diceFighter);
			System.out.println("The offender hits and caused " + damage + " of damage.");
		} else {
			System.out.println("The offender tries to hit but missed the opponent.");
		}
		return damage;
	}
	
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
    	return "The complete name is " + name + " " + clanName + ", the life points are " + lifePoints + " and the armor class is " + armorClass;
	}

}
