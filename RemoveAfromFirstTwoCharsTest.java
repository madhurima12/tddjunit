package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAfromFirstTwoCharsTest {
      
	/*
	 * 1.4 chars 1 A in first char: ABCD=>BCD
	 * 2.4 chars 2 A in first two chars: AACD=>CD
	 * 3.4 chars 1 A in second char: BACD=>BCD
	 * 4.4 chars 2 A in last two char: BBAA=>BBAA
	 * 5.n chars 2 A in first two char 2 A in last two chars: AABAA=>BAA 
	*/
	RemoveAfromFirstTwoChars removeAfromfirsttwochars;
	@BeforeEach
	void setup() {
		removeAfromfirsttwochars= new RemoveAfromFirstTwoChars();
	}
	@Test
	void test1Ainfirst() {
		assertEquals("BCD",removeAfromfirsttwochars.remove("ABCD"));
		
		
	}
	@Test
	void test2Ainfirst() {
		assertEquals("CD",removeAfromfirsttwochars.remove("AACD"));
		
	}
	@Test
	void test1Ainsecond() {
		assertEquals("BCD",removeAfromfirsttwochars.remove("BACD"));
	}
	@Test
	void test2Ainlast() {
		assertEquals("BBAA",removeAfromfirsttwochars.remove("BBAA"));
	}
	@Test
	void test2Ainfirstandlast() {
		assertEquals("BAA",removeAfromfirsttwochars.remove("AABAA"));
	}

	

	

}
