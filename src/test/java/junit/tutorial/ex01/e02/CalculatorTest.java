package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CalculatorTest {
	
//	@Autowired
//	public Calculator calculator;
	
	Calculator calculator = new Calculator();

	@Test
	public void divideTest() {
		System.out.println("スタート");
		try {
			calculator.divide(2, 0);
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().matches("divide by zero."));
			System.out.println("例外を取得");
		}
	}

}
