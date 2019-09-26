package mondoFantastico;

public class Human extends Character {
	private int bonusDamage =  (int) (Math.round(Math.random()*3) + 1);
	
	public Human(String name, String clanName, int lifePoints, int armorClass) {
		super(name, clanName, lifePoints, armorClass);
	}	
	
//	public Human(String name, String clanName, int lifePoints, int armorClass, int bonusDamage) {
//		super(name, clanName, lifePoints, armorClass);
//		this.bonusDamage = bonusDamage;
//	}

	public int fight(int diceFighter, int armorDefender){
		int damage = 0;
		if (dice(20) > armorDefender) {
			damage = dice(diceFighter) + bonusDamage;
			System.out.println("The offencer hits and caused " + damage + " of damage.");
		}	 else {
			System.out.println("The offencer tries to hit but missed the opponent.");
		}	
		return damage;
	}
}
