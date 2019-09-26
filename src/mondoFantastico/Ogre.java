package mondoFantastico;

public class Ogre extends Character {
	private int bonusLifePoints = (int) (Math.round(Math.random()*lifePoints*0.25));
	
	public Ogre(String name, String clanName, int lifePoints, int armorClass) {
		super(name, clanName, 0, armorClass);
		this.lifePoints = lifePoints + bonusLifePoints;
	}	
	

    public int getlifePoints() {
    	return lifePoints;
    }

}
