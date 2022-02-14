package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {
	

	@Test
	void test1() {
		assertTrue(NumberUtils.isEven(10));
		System.out.println("test1終了(" + NumberUtils.isEven(10) + ")");
	}
	
	@Test
	void test2() {
		assertFalse(NumberUtils.isEven(7));
		System.out.println("test1終了(" + NumberUtils.isEven(7) + ")");
	}

}
