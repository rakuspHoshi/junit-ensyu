package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	@DisplayName("１６を指定して実行すると「1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16」が取得できる")
	@Test
	public void test() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> result = fizzBuzz.createFizzBuzzList(16);
		List<String> expected = Arrays.asList("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16".split(","));
		assertIterableEquals(expected,result);
	}

}
