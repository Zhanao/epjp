package mondoFantastico;

public class Main {
	public static void main (String[] args) {
		Character[] characters = new Character[5];
		
	    String[] namesArray = {"Aron", "Lurtz", "Tunk", "Caio", "Boris", "Xi"};
	    String[] clanNamesArray = {"Calister", "Xilint", "Arrows", "della Bernarda", "Scarlett", "Barril"};
	    int[] lifePointsArray = {1200, 1375, 1580, 1160, 2150, 1670, 1878};
		
		characters[0] = new Human(null, null, 0);
		characters[1] = new Human(null, null, 0);
		characters[2] = new Ogre(null, null, 0);
		characters[3] = new Ogre(null, null, 0);
		characters[4] = new Human(null, null, 0);
		
		

	}

}
