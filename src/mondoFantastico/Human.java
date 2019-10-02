package mondoFantastico;

public class Human extends Character {
	private int bonusDamage =  dice(4);
	
	public Human(String name, String clanName, int lifePoints, int armorClass) {
		super(name, clanName, lifePoints, armorClass);
	}	
	
	@Override
	public int fight(int diceFighter, int armorDefender, Character offender, Character defender){
		int damage = 0;
		if ((dice(20) + 5) > armorDefender) { //al posto di dice(int) potevo mettere super.dice(int) per richiamare il metodo della classe madre, ma non è ridefinito quindi non serve
			damage = dice(diceFighter) + bonusDamage;
			System.out.println(offender.getFullName() + " attacks " + defender.getFullName() + "and caused " + damage + " of damage, the life remaining is " + defender.getLifePoints() + ".");
		} else {
			System.out.println(offender.getFullName() + " tries to hit " + defender.getFullName() + " but misses it.");
		}
		return damage;
	}
	
}
