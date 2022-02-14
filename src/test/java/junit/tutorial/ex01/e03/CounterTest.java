package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter = new Counter();

	@Test
	public void test1() {
		int rs1 = counter.increment();
		assertEquals(1, rs1, "１を取得");
		System.out.println("test1終了(" + rs1 + ")");
	}

	@Test
	public void test2() {
		counter.increment();
		int rs2 = counter.increment();
		assertEquals(2, rs2, "2を取得");
		System.out.println("test2終了(" + rs2 + ")");
	}

	@Test
	public void test3() {
		for (int i = 1; i <= 50; i++) {
			counter.increment();
		}
		int rs3 = counter.increment();
		assertEquals(51, rs3, "51を取得");
		System.out.println("test3終了(" + rs3 + ")");
	}

}
