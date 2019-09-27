package mondoFantastico;

public class Human extends Character {
	private int bonusDamage =  dice(4);
	
	public Human(String name, String clanName, int lifePoints, int armorClass) {
		super(name, clanName, lifePoints, armorClass);
//		this.lifePoints = lifePoints;
//		this.armorClass = armorClass;
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
	
}
