package lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomCharaTest {

	RandomCharacter rand = new RandomCharacter();

	@Test
	public final void testGetRandomLowerCaseLetter() {
		// fail("Not yet implemented"); // TODO
		char test = rand.getRandomLowerCaseLetter();
		assertTrue(Character.isLowerCase(test));
	}

	@Test
	public final void testGetRandomUpperCaseLetter() {

		char test = rand.getRandomUpperCaseLetter();
		assertTrue(Character.isUpperCase(test));
	}

	@Test
	public final void testGetRandomDigitCharacter() {
		int test = rand.getRandomDigitCharacter();
		assertTrue(Character.isDigit(test));
	}

	@Test
	public final void testGetRandomCharacter() {
		char test = rand.getRandomCharacter();
		assertTrue(Character.isLetterOrDigit(test));
	}

	@Test
	public final void getPrime() {
		int check = (int) rand.getRandomDigitCharacter() - '0';
		boolean isPrime = true;
		System.out.println("Prime numbers: " + check);

		if (check <= 1) {
			isPrime = false;
		}

		else {

			for (int i = 2; i <= check / 2; ++i) {
				// condition for non prime number
				if (check % i == 0) {
					isPrime = false;
					break;
				}
			}

		}
		System.out.println("Is the number prime?: " + isPrime);

		assertTrue(isPrime);
	}

}
