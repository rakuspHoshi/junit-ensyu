package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	@DisplayName("テキストファイルを指定してメソッドを実行すると、名前、名字、メールアドレスが反映されたEmployeeオブジェクトのリストを取得するテスト")
	@Test
	public void test() {
		InputStream input = null;
		File file = new File("C:\\env\\springworkspace\\junit-ensyu\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");
		try {
			input = new FileInputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		final List<Employee> emp = Employee.load(input);
		System.out.println(emp.get(0));
		System.out.println(emp.get(0).getFirstName());
		System.out.println(emp.get(0).getLastName());
		System.out.println(emp.get(0).getEmail());
		
		assertAll(
				() -> assertEquals("Ichiro", emp.get(0).getFirstName(), "name"),
				() -> assertEquals("Tanaka", emp.get(0).getLastName(), "age"),
				() -> assertEquals("ichiro@example.com", emp.get(0).getEmail(), "email")
			);
	}
}
