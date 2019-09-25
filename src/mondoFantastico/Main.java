package mondoFantastico;

public class Main {
	public static void main (String[] args) {
		Character[] characters = new Character[5];
		
	    String[] namesArray = {"Aron", "Lurtz", "Tunk", "Caio", "Boris", "Xi"};
	    String[] clanNamesArray = {"Calister", "Xilint", "Arrows", "della Bernarda", "Scarlett", "Barril"};
	    int[] lifePointsArray = {50, 42, 87, 103, 79, 84, 61};
		
		characters[0] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))]);
		characters[1] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))]);
		characters[2] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))]);
		characters[3] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))]);
		characters[4] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], lifePointsArray[(int) (Math.round(Math.random()*6))]);
		
		for(Character character : characters) {
			if (character instanceof Human) {
				System.out.println("This is a Human");
				character.fight(character.dice(6));
				Human h =(Human)character;
				System.out.println(h.getFullNameAndStats());
			}
			if (character instanceof Ogre) {
				System.out.println("This is a Ogre");
				character.fight(character.dice(6));
				Ogre o =(Ogre)character;
				System.out.println(o.getFullNameAndStats());
			}
		}

	}

}
