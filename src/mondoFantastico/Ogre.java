package mondoFantastico;

public class Ogre extends Character {
	private int bonusLifePoints = (int) (Math.round(Math.random()*lifePoints*0.25));
	
	public Ogre(String name, String clanName, int lifePoints) {
		this(name, clanName, lifePoints, 0);
	}	
	
	public Ogre (String name, String clanName, int lifePoints, int bonusLifePoints) {
		super(name, clanName, lifePoints);
		this.bonusLifePoints = bonusLifePoints;
	}

    public int getlifePoints() {
    	return lifePoints + bonusLifePoints;
    }

}
