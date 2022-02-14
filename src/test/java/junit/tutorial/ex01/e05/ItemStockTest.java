package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	Item book = new Item("book", 1000);
	Item CD = new Item("CD", 1500);
	
	@Test
	@DisplayName("初期状態で、getNumで０が取得できるテスト")
	public void test1() {
		ItemStock itemStock = new ItemStock();
		int rs1 = itemStock.getNum(book);
		assertEquals(0, rs1, "初期状態で、getNumで０が取得できる");
	}

	@Test
	@DisplayName("初期状態で、addでItemを追加するとgetNumで１が取得できるテスト")
	public void test2() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(book);
		int rs2 = itemStock.getNum(book);
		assertEquals(1, rs2, "1つ追加したので1を取得");
	}
	
	
	
	ItemStock itemStock2 = new ItemStock();
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、getNumで１が取得できるテスト")
	public void test3() {
		itemStock2.add(book);
		int rs3 = itemStock2.getNum(book);
		assertEquals(1, rs3, "Itemが１つ追加されている状態で、getNumで１が取得");
	}

	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できるテスト")
	public void test4() {
		itemStock2.add(book);
		itemStock2.add(book);
		int rs4 = itemStock2.getNum(book);
		assertEquals(2, rs4, "Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得");
	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できるテスト")
	public void test5() {
		itemStock2.add(book);
		itemStock2.add(CD);
		int rs5 = itemStock2.getNum(book);
		assertEquals(1, rs5, "Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得");
	}

}
