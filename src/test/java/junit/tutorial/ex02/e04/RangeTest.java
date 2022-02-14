package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {
	
	@DisplayName("min=0.0、max=10.5のRangeのときのテスト")
	@ParameterizedTest
	@ValueSource(doubles = {-0.1, 0.0, 10.5, 10.6})
	void test(double value) {
		Range range = new Range(0.0, 10.5);
		if(range.contains(value) == true) {
			assertTrue(range.contains(value));
		} else {
			assertFalse(range.contains(value));
		}
	}
	
	@DisplayName("min=-5.1、max=5.1のRangeのときのテスト")
	@Nested
	class test2{
		Range rangeNest = new Range(-5.1, 5.1);
		
		@DisplayName("value=-5.2のときのテスト")
		@Test
		void test2_1() {
			assertFalse(rangeNest.contains(-5.2));
		}
		@DisplayName("value=-5.1のときのテスト")
		@Test
		void test2_2() {
			assertTrue(rangeNest.contains(-5.1));
		}
		@DisplayName("value=5.1のときのテスト")
		@Test
		void test2_3() {
			assertTrue(rangeNest.contains(5.1));
		}
		@DisplayName("value=5.2のときのテスト")
		@Test
		void test2_4() {
			assertFalse(rangeNest.contains(5.2));
		}
	}
}