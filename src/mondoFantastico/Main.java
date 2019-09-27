package mondoFantastico;

public class Main {	
	public static void main (String[] args) {
		Character[] characters = new Character[5];
		
	    String[] namesArray = {"Aron", "Lurtz", "Tunk", "Caio", "Boris", "Xi"};
	    String[] clanNamesArray = {"Calister", "Xilint", "Arrows", "della Bernarda", "Scarlett", "Barril"};
//	    int[] lifePointsArray = {50, 42, 87, 103, 79, 84, 61};
//	    int[] lifeArmorClassArray = {12, 8, 13, 15, 11, 9, 17};	queste righe non servono, i valori vengono randomizzati nella classe Character    
	    
		characters[0] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[1] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[2] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[3] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[4] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		
		
//		for(Character character : characters) {
//			if (character instanceof Human) {
//				System.out.println("This is a Human");
//				character.fight(Character.dice(6), character.getArmorClass());
//				Human h =(Human)character;
//				System.out.println(h.getFullNameAndStats());
//			}
//			if (character instanceof Ogre) {
//				System.out.println("This is a Ogre");
//				character.fight(Character.dice(6), character.getArmorClass());
//				Ogre o =(Ogre)character;
//				System.out.println(o.getFullNameAndStats());
//			}
//		}
//		
//		System.out.println(characters[1].getArmorClass()); //ci da la classe armatura
//		System.out.println(characters[1].getLifePoints()); //ci da i punti vita
//		
//		int damage = characters[1].fight(Character.dice(6), characters[1].getArmorClass()); //inizializza il danno
//		characters[1].lifePoints = characters[1].lifePoints - damage; //modifica la vita
		
		System.out.println(characters[1].getLifePoints());
		System.out.println(coupleDifferentIndexDices(3)[0] + "and" + coupleDifferentIndexDices(3)[1]);

//		while((characters[0].getLifePoints() != 0) && (characters[1].getLifePoints() != 0) && (characters[2].getLifePoints() != 0) && (characters[3].getLifePoints() != 0) && (characters[4].getLifePoints() != 0)) {
//			int[] offenderAndDefencerArray = coupleDifferentIndexDices(5);
//		}
	}
	
	public static int[] coupleDifferentIndexDices(int faces) {
		int resultFirst = Character.dice(faces) - 1;
		int resultSecond = resultFirst;
		if (resultFirst == resultSecond && resultFirst >= (faces - 1)) {
			resultSecond = resultFirst - 1;
		} if (resultFirst == resultSecond && resultFirst == 0) {
			resultSecond = resultFirst + 1;
		} if (resultFirst == resultSecond ) {
			resultSecond = resultFirst + 1;
		}
		int[] resultArray = {resultFirst, resultSecond};
		return resultArray;
	}

}
