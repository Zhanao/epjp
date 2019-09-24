package mondoFantastico;

public class Ogre extends Character {
	
	public Ogre(String name, String clanName, int lifePoints) {
		super(name, clanName, lifePoints);
	}

	@Override
	public static int fight(int damage, int bonus) {
		bonus = (int) (Math.round(Math.random()*3) + 1);
		damage = (int) (Math.round(Math.random()*11) + 1) + bonus;
		return damage;
	}	

    public int getlifePoints() {
    	return lifePoints;
    }

}
