package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MonthlyCalendarTest {

	@DisplayName("システム時間に依存するテスト")
	@ParameterizedTest
	@CsvSource({
		"2012-01-31, 0",
		"2012-01-30, 1",
		"2012-02-01, 28"
		})
	void test(LocalDate nowDate, int expected) {
		MonthlyCalendar calendar = new MonthlyCalendar(nowDate);
		assertEquals(expected, calendar.getRemainingDays());
	}
	

}
