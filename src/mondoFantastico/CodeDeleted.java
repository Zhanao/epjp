package mondoFantastico;

public class CodeDeleted {
	
//	public class Main {	
//		public static void main (String[] args) {
//			Character[] characters = new Character[5];
//			
//		    String[] namesArray = {"Aron", "Lurtz", "Tunk", "Caio", "Boris", "Xi"};
//		    String[] clanNamesArray = {"Calister", "Xilint", "Arrows", "della Bernarda", "Scarlett", "Barril"};
////		    int[] lifePointsArray = {50, 42, 87, 103, 79, 84, 61};
////		    int[] lifeArmorClassArray = {12, 8, 13, 15, 11, 9, 17};	queste righe non servono, i valori vengono randomizzati nella classe Character    
//		    
//			characters[0] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
//			characters[1] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
//			characters[2] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
//			characters[3] = new Ogre(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
//			characters[4] = new Human(namesArray[(int) (Math.round(Math.random()*5))], clanNamesArray[(int) (Math.round(Math.random()*5))], 0, 0);
//			
//			System.out.println("The whole group of chracters is the following:");
//			
//			for(Character character : characters) {
//				if (character instanceof Human) {
//					System.out.println("-This is a Human");
//					//character.fight(Character.dice(6), character.getArmorClass());
//					Human h =(Human)character;
//					System.out.println(h.getFullNameAndStats());
//				}
//				if (character instanceof Ogre) {
//					System.out.println("-This is a Ogre");
//					//character.fight(Character.dice(6), character.getArmorClass());
//					Ogre o =(Ogre)character;
//					System.out.println(o.getFullNameAndStats());
//				}
//			}
////			
////			System.out.println(characters[1].getArmorClass()); //ci da la classe armatura
////			System.out.println(characters[1].getLifePoints()); //ci da i punti vita
////			
////			int damage = characters[1].fight(Character.dice(6), characters[1].getArmorClass()); //inizializza il danno
////			characters[1].lifePoints = characters[1].lifePoints - damage; //modifica la vita
//			
//			//System.out.println(characters[1].getLifePoints());
//			
//			//int[] arrayIndex = coupleDifferentIndexDices(5);
//			//System.out.println(arrayIndex[0] + "and" + arrayIndex[1]);
//			int[] offenderAndDefencerArray = coupleDifferentIndexDices(5);
//			//System.out.println(characters[offenderAndDefencerArray[0]].getLifePoints());
//			//System.out.println(characters[offenderAndDefencerArray[1]].getLifePoints());
//			
//			System.out.println("The battle starts and the characters involved are:");
//
////			System.out.println(characters[offenderAndDefencerArray[0]].getFullName() + " attacks " + characters[offenderAndDefencerArray[1]].getFullName());
////			int damage = characters[offenderAndDefencerArray[0]].fight(Character.dice(12), characters[offenderAndDefencerArray[1]].getArmorClass());
////			characters[offenderAndDefencerArray[0]].lifePoints = characters[offenderAndDefencerArray[0]].lifePoints - damage;
////			System.out.println(characters[offenderAndDefencerArray[0]].getLifePoints());
//			
//			int roundNumber = 1;
//			
//			//(characters[offenderAndDefencerArray[0]].getLifePoints() != 0) || (characters[offenderAndDefencerArray[1]].getLifePoints() != 0)
//			
//			while((characters[offenderAndDefencerArray[0]].getLifePoints() > 0) && (characters[offenderAndDefencerArray[1]].getLifePoints() > 0)) {
//				if (Character.dice(2) == 1) {
//					System.out.println("-This is the round number " + roundNumber);
//					int damage1 = characters[offenderAndDefencerArray[0]].fight(Character.dice(6), characters[offenderAndDefencerArray[1]].getArmorClass(), characters[offenderAndDefencerArray[0]], characters[offenderAndDefencerArray[1]]);
//					characters[offenderAndDefencerArray[1]].lifePoints = characters[offenderAndDefencerArray[1]].lifePoints - damage1;
//					if(characters[offenderAndDefencerArray[1]].getLifePoints() < 0) {
//						characters[offenderAndDefencerArray[1]].lifePoints = 0;	
//					} 
//					//System.out.println(characters[offenderAndDefencerArray[1]].getLifePoints());
//					//System.out.println(characters[offenderAndDefencerArray[0]].getFullName() + " attacks " + characters[offenderAndDefencerArray[1]].getFullName() + "and caused " + damage1 + " of damage, the life remaining is " + characters[offenderAndDefencerArray[1]].getLifePoints() + ".");
//				}
//				if (Character.dice(2) == 2) {
//					System.out.println("-This is the round number " + roundNumber);
//					int damage2 = characters[offenderAndDefencerArray[1]].fight(Character.dice(6), characters[offenderAndDefencerArray[0]].getArmorClass(), characters[offenderAndDefencerArray[1]], characters[offenderAndDefencerArray[0]]);
//					characters[offenderAndDefencerArray[0]].lifePoints = characters[offenderAndDefencerArray[0]].lifePoints - damage2;
//					if(characters[offenderAndDefencerArray[0]].getLifePoints() < 0) {
//						characters[offenderAndDefencerArray[0]].lifePoints = 0;	
//					} 
//					//System.out.println(characters[offenderAndDefencerArray[0]].getLifePoints());
//					//System.out.println(characters[offenderAndDefencerArray[1]].getFullName() + " attacks " + characters[offenderAndDefencerArray[0]].getFullName() + "and caused " + damage2 + " of damage, the life remaining is " + characters[offenderAndDefencerArray[0]].getLifePoints() + ".");
//
//				}
//				roundNumber++;
//			}
//			
//			if (characters[offenderAndDefencerArray[0]].getLifePoints() == 0) {
//				System.out.println(characters[offenderAndDefencerArray[0]].getFullName() + " is dead and " + characters[offenderAndDefencerArray[1]].getFullName() + " is still alive.");
//			}
//			if (characters[offenderAndDefencerArray[1]].getLifePoints() == 0) {
//				System.out.println(characters[offenderAndDefencerArray[1]].getFullName() + " is dead and " + characters[offenderAndDefencerArray[0]].getFullName() + " is still alive.");
//			}
//		}
//		
//		public static int[] coupleDifferentIndexDices(int faces) {
//			int resultFirst = Character.dice(faces) - 1;
//			int resultSecond = Character.dice(faces) - 1;
//			while (resultFirst == resultSecond) {
//				resultSecond = Character.dice(faces) - 1;
//			}
//			int[] resultArray = {resultFirst, resultSecond};
//			return resultArray;
//		}
//
//	}
//	public abstract class Character {
//		public String name;
//		public String clanName;
//		public int lifePoints = 10 + multipleDices(10, 5);
//		public int bonusDex = dice(7) - 2;
//		public int armorClass = 10 + bonusDex;
//
//		public Character(String name, String clanName, int lifePoints, int armorClass) {
//			this.name = name;
//			this.clanName = clanName;
////			this.lifePoints = lifePoints;
////			this.armorClass = armorClass; se metto queste due righe non randomizza la vita e l'armatura inizializzate in questa classe
//		}
//		
//		public static int dice(int faces) {
//			return (int) Math.round(Math.random()*(faces - 1) + 1);
//		}
//		
//		public int multipleDices(int faces, int times) {
//			int result = 0;
//			for (int i = 0; i < times; i++) {
//				result += (int) Math.round(Math.random()*(faces - 1) + 1);
//			}
//			return result;
//		}
//		
//		public int fight(int diceFighter, int armorDefender, Character offender, Character defender){
//			int damage = 0;
//			if ((dice(20) + 5) > armorDefender) {
//				damage = dice(diceFighter) + 5;
//				System.out.println(offender.getFullName() + " attacks " + defender.getFullName() + "and caused " + damage + " of damage, the life remaining is " + defender.getLifePoints() + ".");
//			} else {
//				System.out.println(offender.getFullName() + " tries to hit " + defender.getFullName() + " but misses it.");
//			}
//			return damage;
//		}
//		
//		public int getLifePoints() {
//			return lifePoints;
//		}
//		
//		
//		public int getArmorClass() {
//			return armorClass;
//		}
//		
//		public String getFullName() {
//			return name + " " + clanName;
//		}
//		
//		public String getFullNameAndStats() {
//	    	return "The complete name is " + name + " " + clanName + ", the life points are " + lifePoints + " and the armor class is " + armorClass;
//		}
//
//	}
//	
//	public class Human extends Character {
//		private int bonusDamage =  dice(4);
//		
//		public Human(String name, String clanName, int lifePoints, int armorClass) {
//			super(name, clanName, lifePoints, armorClass);
////			this.lifePoints = lifePoints;
////			this.armorClass = armorClass;
//		}	
//		
////		public Human(String name, String clanName, int lifePoints, int armorClass, int bonusDamage) {
////			super(name, clanName, lifePoints, armorClass);
////			this.bonusDamage = bonusDamage;
////		}
//		
//		@Override
//		public int fight(int diceFighter, int armorDefender, Character offender, Character defender){
//			int damage = 0;
//			if ((dice(20) + 5) > armorDefender) { //al posto di dice(int) potevo mettere super.dice(int) per richiamare il metodo della classe madre, ma non è ridefinito quindi non serve
//				damage = dice(diceFighter) + bonusDamage;
//				System.out.println(offender.getFullName() + " attacks " + defender.getFullName() + "and caused " + damage + " of damage, the life remaining is " + defender.getLifePoints() + ".");
//			} else {
//				System.out.println(offender.getFullName() + " tries to hit " + defender.getFullName() + " but misses it.");
//			}
//			return damage;
//		}
//		
//	}
//	
//	public class Ogre extends Character {
//		private int bonusLifePoints = (int) (Math.round(Math.random()*lifePoints*0.25));
//		
//		public Ogre(String name, String clanNames, int lifePoints, int armorClass) {
//			super(name, clanNames, 0, 0);
//			super.lifePoints += bonusLifePoints;
//		}	
//
//	}

}
