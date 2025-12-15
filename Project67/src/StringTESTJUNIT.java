import static org.junit.Assert.*;
import org.junit.Test;

/*
* Class: CMSC201
* Instructor:
* Description: (Give a brief description for each Program)
* Due: 12/08/25
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Bryan Gonzalez
*/


/**
 * JUnit test for string.
 */
public class StringTESTJUNIT {

	/**
	 * Test method, feels fun when I see green.
	 */
	@Test
	public void m1() {
		String str = "Hello, World!";
		assertEquals(13, str.length());
	}
	
	/**
	 * Test method, feels fun when I see green.
	 */
	@Test
	public void m2() {
		String str = "Hello Mr Professor, I only like java when it's not toooo hard.";
		assertEquals("java", str.substring(32, 36));
	}
	/**
	 * Test method, feels fun when I see green.
	 */
	@Test
	public void m3() {
		String str = "a";
		assertEquals('a', str.charAt(0));
	}
	/**
	 * Test method, feels fun when I see green.
	 */
	@Test
	public void m4() {
		String str = "CMSC 201 is kinda fun";
		assertEquals(5, str.indexOf("201"));
	}
}

