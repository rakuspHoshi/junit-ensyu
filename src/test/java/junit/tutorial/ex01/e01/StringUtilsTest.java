package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
	
	@Test
	public void testAaa() {
		assertEquals("aaa", StringUtils.toSnakeCase("aaa"), "aaaじゃない");
		System.out.println("aaaテスト終了");
	}
	
	@Test
	public void testHello() {
		assertEquals("hello_world", StringUtils.toSnakeCase("HelloWorld"), "hello_worldじゃない");
		System.out.println("HelloWorldテスト終了");
	}
	
	@Test
	public void testPractice() {
		assertEquals("practice_junit", StringUtils.toSnakeCase("practiceJunit"), "practice_junitじゃない");
		System.out.println("practiceJunitテスト終了");
	}
	
	

}
