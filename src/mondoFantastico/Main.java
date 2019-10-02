package mondoFantastico;

public class Main {	
	public static void main (String[] args) {
		Character[] characters = new Character[5];
		
	    String[] namesArray = {"Aron", "Lurtz", "Tunk", "Caio", "Boris", "Xi"};
	    String[] clanNamesArray = {"Calister", "Xilint", "Arrows", "della Bernarda", "Scarlett", "Barril"};

		characters[0] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[1] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[2] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[3] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		characters[4] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
		
		System.out.println("The whole group of chracters is composed by the following characters:");
		
		for(Character character : characters) {
			if (character instanceof Human) {
				System.out.println("-This is a Human");
				Human h =(Human)character;
				System.out.println(h.getFullNameAndStats());
			}
			if (character instanceof Ogre) {
				System.out.println("-This is a Ogre");
				Ogre o =(Ogre)character;
				System.out.println(o.getFullNameAndStats());
			}
		}

		int[] offenderAndDefencerArray = coupleDifferentIndexDices(5);
		
		System.out.println("-----");
		System.out.println("-----");
		System.out.println("The battle starts and the characters involved are:");
		
		int roundNumber = 1;
		
		while((characters[offenderAndDefencerArray[0]].getLifePoints() > 0) && (characters[offenderAndDefencerArray[1]].getLifePoints() > 0)) {
			if (Character.dice(2) == 1) {
				System.out.println("-This is the round number " + roundNumber);
				int damage1 = characters[offenderAndDefencerArray[0]].fight(Character.dice(6), characters[offenderAndDefencerArray[1]].getArmorClass(), characters[offenderAndDefencerArray[0]], characters[offenderAndDefencerArray[1]]);
				characters[offenderAndDefencerArray[1]].lifePoints = characters[offenderAndDefencerArray[1]].lifePoints - damage1;
				if(characters[offenderAndDefencerArray[1]].getLifePoints() < 0) {
					characters[offenderAndDefencerArray[1]].lifePoints = 0;	
					} 
				roundNumber++;
				System.out.println("-----");
				}
			if (Character.dice(2) == 2) {
				System.out.println("-This is the round number " + roundNumber);
				int damage2 = characters[offenderAndDefencerArray[1]].fight(Character.dice(6), characters[offenderAndDefencerArray[0]].getArmorClass(), characters[offenderAndDefencerArray[1]], characters[offenderAndDefencerArray[0]]);
				characters[offenderAndDefencerArray[0]].lifePoints = characters[offenderAndDefencerArray[0]].lifePoints - damage2;
				if(characters[offenderAndDefencerArray[0]].getLifePoints() < 0) {
					characters[offenderAndDefencerArray[0]].lifePoints = 0;	
					} 
				roundNumber++;
				System.out.println("-----");
				}
		}
		
		if (characters[offenderAndDefencerArray[0]].getLifePoints() == 0) {
			System.out.println(characters[offenderAndDefencerArray[0]].getFullName() + " is dead and " + characters[offenderAndDefencerArray[1]].getFullName() + " is still alive.");
		}
		if (characters[offenderAndDefencerArray[1]].getLifePoints() == 0) {
			System.out.println(characters[offenderAndDefencerArray[1]].getFullName() + " is dead and " + characters[offenderAndDefencerArray[0]].getFullName() + " is still alive.");
		}
	}
	
	public static int[] coupleDifferentIndexDices(int faces) {
		int resultFirst = Character.dice(faces) - 1;
		int resultSecond = Character.dice(faces) - 1;
		while (resultFirst == resultSecond) {
			resultSecond = Character.dice(faces) - 1;
		}
		int[] resultArray = {resultFirst, resultSecond};
		return resultArray;
	}

}
