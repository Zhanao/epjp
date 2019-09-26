package mondoFantastico;

public class Main {
	public static void main (String[] args) {
		Character[] characters = new Character[5];
		
	    String[] namesArray = {"Aron", "Lurtz", "Tunk", "Caio", "Boris", "Xi"};
	    String[] clanNamesArray = {"Calister", "Xilint", "Arrows", "della Bernarda", "Scarlett", "Barril"};
	    int[] lifePointsArray = {50, 42, 87, 103, 79, 84, 61};
	    int[] lifeArmorClassArray = {12, 8, 13, 15, 11, 9, 17};	    
	    
	    
		characters[0] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))], lifeArmorClassArray[(int) (Math.round(Math.random()*6))]);
		characters[1] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))], lifeArmorClassArray[(int) (Math.round(Math.random()*6))]);
		characters[2] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))], lifeArmorClassArray[(int) (Math.round(Math.random()*6))]);
		characters[3] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))], lifeArmorClassArray[(int) (Math.round(Math.random()*6))]);
		characters[4] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))], lifeArmorClassArray[(int) (Math.round(Math.random()*6))]);
		
		for(Character character : characters) {
			if (character instanceof Human) {
				System.out.println("This is a Human");
				character.fight(character.dice(6), character.getArmorClass());
				Human h =(Human)character;
				System.out.println(h.getFullNameAndStats());
			}
			if (character instanceof Ogre) {
				System.out.println("This is a Ogre");
				character.fight(character.dice(6), character.getArmorClass());
				Ogre o =(Ogre)character;
				System.out.println(o.getFullNameAndStats());
			}
		}
		
		System.out.println(characters[1].getArmorClass()); //ci da la classe armatura
		System.out.println(characters[1].getLifePoints()); //ci da i punti vita
		
		int damage = characters[1].fight(characters[1].dice(6), characters[1].getArmorClass()); //inizializza il danno
		characters[1].lifePoints = characters[1].lifePoints-damage; //modifica la vita
		
		System.out.println(characters[1].getLifePoints());		
//		int[] lFC = new int[5];
//		for (int i = 0; i < 5; i++) {
//			lFC[i] = characters[i].getLifePoints();
//		}

		//while(characters[0].getLifePoints() != 0 && characters[1].getLifePoints())
	}

}
