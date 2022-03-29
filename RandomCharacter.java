package lab9;

import java.util.Random;

public class RandomCharacter {
	public static char getRandomLowerCaseLetter() {
		Random r = new Random();
		char c = (char)('a'+ r.nextInt(26));
		c = Character.toLowerCase(c);
		return c;
	}

	public static char getRandomUpperCaseLetter() {
		Random r = new Random();
		char c = (char) (r.nextInt(26) + 'a');
		c = Character.toUpperCase(c);
		return c;
	}

	public static char getRandomDigitCharacter() {
		//Random rand = new Random();
		int b = (int)(Math.random()*(9-0+1)+0);  
		//char c =  int n = rnd.nextInt(10);
        char c = Character.forDigit(b, 10);
        return c;
       // return b;
	}

	public static char getRandomCharacter() {
		Random rand = new Random();
	
		int randomNum = rand.nextInt(3);
		char random;

		if (randomNum == 1) {
			random = getRandomLowerCaseLetter();

		} else if (randomNum == 2) {
			random = getRandomUpperCaseLetter();
		} else {
			random = (char) getRandomDigitCharacter();
		}
		
		return random;

	}

	public static void main(String args[]) {
		for (int i = 1; i <= 15; i++) {
			System.out.print(getRandomLowerCaseLetter());
		}
		System.out.println("");
		for (int i = 1; i <= 15; i++) {
			System.out.print(getRandomUpperCaseLetter());
		}
		System.out.println("");
		for (int i = 1; i <= 15; i++) {
			System.out.print(getRandomDigitCharacter());
		}
		System.out.println("");
		for (int i = 1; i <= 15; i++) {
			System.out.print(getRandomCharacter());
		}

	}

}
