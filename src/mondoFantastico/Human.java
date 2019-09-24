package mondoFantastico;

public class Human extends Character {
	private int bonus =  (int) (Math.round(Math.random()*3) + 1);
	
	public Human(String name, String clanName, int lifePoints) {
		super(name, clanName, lifePoints);
	}

	public int fight(int damage) {
		damage = damage + bonus; 
		return damage;
	}
}
