package s111;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class getStat {

	public Stat getStat(String s) {

		HashMap<Character, Integer> hp = new HashMap<Character, Integer>(); // devo mettere reference e non primitive

		for (int i = 0; i < s.length(); i++) {

			if (hp.containsKey(s.charAt(i))) {

				hp.put(s.charAt(i), hp.get(s.charAt(i)) + 1);
			} else {
				hp.put(s.charAt(i), 1);
			}
		}
		// metodo alternativo sarabbe di creare array di key e creare di value. fare il max su value. fare for each della key , adare a vedere il valore corrispondente ad ogni key, se valore == max allora key è most popular
		
		TreeMap<Integer, Character> tm = new TreeMap<Integer,Character>();
		Iterator<Map.Entry<Character, Integer>> it = hp.entrySet().iterator(); //entry è una inner class, voglio fare creare un iteratore del tipo coppia key value in una mappa
		
		while (it.hasNext()) {
			Map.Entry<Character, Integer> entry=it.next();
			tm.put(entry.getValue(),entry.getKey());
		}
		
		 Map.Entry<Integer,Character> last = tm.lastEntry();
		
//		int chiave=0;
//		while(tm.higherKey(chiave)!=null) {//trova la chiave appena piu grande della chiave inserita, altrimenti ritorna null
//			chiave=tm.higherKey(chiave);
//		}
//			
			return new Stat( last.getValue(),last.getKey(), hp.size());

		}

	}


