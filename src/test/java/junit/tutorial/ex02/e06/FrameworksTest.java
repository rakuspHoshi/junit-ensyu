package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {
	
	@DisplayName("組み合わせテスト")
	@ParameterizedTest
	@CsvSource({
		"GlassFish,Oracle",
		"GlassFish,DB2",
		"GlassFish,PostgreSQL",
		"GlassFish,MySQL",
		"JBoss,Oracle",
		"JBoss,DB2",
		"JBoss,PostgreSQL",
		"JBoss,MySQL",
		"Tomcat,Oracle",
		"Tomcat,DB2",
		"Tomcat,PostgreSQL",
		"Tomcat,MySQL"
		})
	public void test(ApplicationServer appServer, Database db) { 
		if(Frameworks.isSupport(appServer, db) == true) {
			assertTrue(Frameworks.isSupport(appServer, db));
			System.out.println("true :" + appServer + " + " + db);
		} else {
			assertFalse(Frameworks.isSupport(appServer, db));
			System.out.println("false :" + appServer + " + " + db);
		}
		
	}

}
