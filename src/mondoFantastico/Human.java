package mondoFantastico;

public class Human extends Character {
	public Human(String name, String clanName, int lifePoints) {
		super(name, clanName, lifePoints);
	}

	@Override
	public int fight(int damage) {
		damage = (int) (Math.round(Math.random()*11) + 1); 
		return damage;
	}
}
