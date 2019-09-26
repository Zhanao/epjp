package mondoFantastico;

public class Human extends Character {
	private int bonusDamage =  dice(4);
	private int armorClass = 10 + bonusDex;
	
	public Human(String name, String clanName, int lifePoints, int armorClass) {
		super(name, clanName, 0, 0);
		this.lifePoints = super.lifePoints;
		this.armorClass = 10 + bonusDex;
	}	
	
//	public Human(String name, String clanName, int lifePoints, int armorClass, int bonusDamage) {
//		super(name, clanName, lifePoints, armorClass);
//		this.bonusDamage = bonusDamage;
//	}
	
	@Override
	public int fight(int diceFighter, int armorDefender){
		int damage = 0;
		if (dice(20) > armorDefender) { //al posto di dice(int) potevo mettere super.dice(int) per richiamare il metodo della classe madre, ma non è ridefinito quindi non serve
			damage = dice(diceFighter) + bonusDamage;
			System.out.println("The offender hits and caused " + damage + " of damage.");
		}	 else {
			System.out.println("The offender tries to hit but missed the opponent.");
		}	
		return damage;
	}
	
//	public int getLifePoints() {
//		return lifePoints;
//	}
//	
//	
//	public int getArmorClass() {
//		return armorClass;
//	}
//	
//	public String getFullName() {
//		return name + " " + clanName;
//	}
//	
//	public String getFullNameAndStats() {
//    	return "The complete name is " + name + " " + clanName + ", the life points are " + lifePoints + " and the armor class is " + armorClass;
//	}
}
