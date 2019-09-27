package mondoFantastico;

public class Ogre extends Character {
	private int bonusLifePoints = (int) (Math.round(Math.random()*lifePoints*0.25));
	
	public Ogre(String name, String clanNames, int lifePoints, int armorClass) {
		super(name, clanNames, 0, 0);
		super.lifePoints += bonusLifePoints;
	}	

}
