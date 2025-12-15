import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTestJUNIT {

	/**
	 * Test method, feels fun when I see green.
	 */
	@Test
	public void testPrime() {
		assertTrue(PrimeNumberMethod.isPrime(17));
	}
	
	/**
	 * Test method, feels fun when I see green.
	 */
	@Test
	public void testNotPrime() {
		assertFalse(PrimeNumberMethod.isPrime(18));
	}
}
