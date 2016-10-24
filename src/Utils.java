

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

	private static Random r = new Random();

	private static final Integer[] tones = {0,1,2,3,4,5,6,7,8,9,10,11};

	public static Integer[] generateTones() {
		List<Integer> l = Arrays.asList(tones);
		Collections.shuffle(l);

		return (Integer[])l.toArray();
	}
	
	public static Integer[] transposeArray(Integer[] tones, int t) {
		Integer[] tr = new Integer[tones.length];

		for(int x = 0; x < tones.length; x++) {
			tr[x] = (tones[x] + t) % 12;
		}

		return tr;
	}
	
	public static int randomOct(int min, int max) {
		int rand = ThreadLocalRandom.current().nextInt(min,max);
		return 12*rand;
	}
	
	public static String randomDur() {
		int rand = r.nextInt(7 +1);
		switch(rand) {
		case 0 : return "w";
		case 1 : return "h";
		case 2 : return "q";
		case 3 : return "i";
		case 4 : return "w.";
		case 5 : return "h.";
		case 6 : return "q.";
		case 7 : return "i.";
		default : return "wha?";
		}
	}
}
