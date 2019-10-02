package mondoFantastico;

public abstract class Character {
	public String name;
	public String clanName;
	public int lifePoints = 10 + multipleDices(10, 5);
	public int bonusDex = dice(7) - 2;
	public int armorClass = 10 + bonusDex;

	public Character(String name, String clanName, int lifePoints, int armorClass) {
		this.name = name;
		this.clanName = clanName;
	}
	
	public static int dice(int faces) {
		return (int) Math.round(Math.random()*(faces - 1) + 1);
	}
	
	public int multipleDices(int faces, int times) {
		int result = 0;
		for (int i = 0; i < times; i++) {
			result += (int) Math.round(Math.random()*(faces - 1) + 1);
		}
		return result;
	}
	
	public int fight(int diceFighter, int armorDefender, Character offender, Character defender){
		int damage = 0;
		if ((dice(20) + 5) > armorDefender) {
			damage = dice(diceFighter) + 5;
			System.out.println(offender.getFullName() + " attacks " + defender.getFullName() + "and caused " + damage + " of damage, the life remaining is " + defender.getLifePoints() + ".");
		} else {
			System.out.println(offender.getFullName() + " tries to hit " + defender.getFullName() + " but misses it.");
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
