package mondoFantastico;

public class Ogre extends Character {
	private int bonusLifePoints = 1000;//(int) (Math.round(Math.random()*lifePoints*0.25));
	
	public Ogre(String name, String clanNames, int lifePoints, int armorClass) {
		super(name, clanNames, 0, 0);
		this.lifePoints = lifePoints + bonusLifePoints;
		this.armorClass = 10 + bonusDex;
	}	
	
	public int getLifePoints() {
		return lifePoints + bonusLifePoints;
	}
	
	
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
