package mondoFantastico;

public abstract class Character {
	private String name;
	private String clanName;
	public int lifePoints;
	//private int armorClass;
	

	public Character(String name, String clanName, int lifePoints) {
		this.name = name;
		this.clanName = clanName;
		this.lifePoints = lifePoints;
	}
	
	public int dice(int faces) {
		int result = (int) Math.round(Math.random()*(faces - 1) + 1);
		return result;
	}
	
	public int fight(int damage){
		System.out.println("The damage is: " + damage);
		return damage;
	}
	
//	public int armor(int defence) {
//		
//	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public String getFullName() {
		return name + " " + clanName;
	}
	
	public String getFullNameAndStats() {
    	return "The complete name is " + name + " " + clanName + " and the life points are " + lifePoints;
	}

}
