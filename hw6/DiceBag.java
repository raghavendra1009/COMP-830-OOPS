package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// This class holds the dice(or tokens) to be drawn.
//
public class DiceBag {
	
	private List<Token> bag = new ArrayList<Token>();
	
	public boolean addToken(Token t) {
		bag.add(t);
		return true;
	}

	public Token drawToken() {
		int upperRange = bag.size();
		Token t = null;
		
		if (upperRange > 1 ) {
			int die = ThreadLocalRandom.current().nextInt(1, upperRange);
			t = bag.remove(die);
		}   
		
		System.out.println("tttt"+t);
		return t;
	}
	
	public String toString() {
		String ret = " Dice left: " + bag.size() + "\n";
		
		for (Token t:bag) {
			ret += t.toString() + "\n";
		}
	//	System.out.println("birthday wishes 2 "+ret);

		return ret;
	}
}
