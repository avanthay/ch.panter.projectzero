package ch.dave.junit.exercice;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnitTest {

	private FirstJUnit instance;

	@Before
	public void init() {
		this.instance = new FirstJUnit();
	}

	@After
	public void clear() {
		this.instance = null;
	}
	/*
	 * make sure the created instance isn't null
	 */
	@Test
	public void isNotNull() {
		assertNotNull(this.instance);
	}
	
	/*
	 * make sure that the method returns false when an other String then "" oder null is given in the isEmpty() method
	 */
	@Test
	public void StringIsEmpty(){
		assertTrue(this.instance.isEmpty(""));
		assertTrue(this.instance.isEmpty(null));
		assertFalse(this.instance.isEmpty("hallo"));
	}
	
	/*
	 * make sure the String given in the capitalize() method comes out in the form "Hallo"
	 */
	@Test
	public void StringCapitalize(){
		assertEquals("Hallo", this.instance.capitalize("hallo"));
		assertEquals("Hallo", this.instance.capitalize("HALLO"));
		assertEquals("123abc", this.instance.capitalize("123ABC"));
		assertEquals("123abc", this.instance.capitalize("123abc"));
	}
	
	/*
	 * checks that the NullPointerException is thrown by calling the reverse() method with the parameter null
	 */
	@Test(expected=NullPointerException.class)
	public void StringReverseException(){
		this.instance.reverse(null);
	}
	
	/*
	 * checks if the string given in the method reverse() is returned in the contrary order
	 */
	@Test
	public void StringReverse(){
		assertEquals("tseT rehcaf-3 niE", this.instance.reverse("Ein 3-facher Test"));
	}
	
	/*
	 * make sure the strings given in the method join() are concatenated
	 */
	@Test
	public void StringJoin(){
		assertEquals("a b c", this.instance.join("a", "b", "c"));
		assertEquals("a b c d e", this.instance.join("a", "b", "c", "d", "e"));
	}
}
