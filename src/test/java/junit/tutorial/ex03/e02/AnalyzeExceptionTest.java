package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AnalyzeExceptionTest {

	@Mock
	private LogLoader logLoader;

	@InjectMocks
	private LogAnalyzer logAnalyzer;

	@DisplayName("例外ハンドリングのテスト")
	@Test
	public void test1() throws IOException {
		Mockito.when(logLoader.load(null)).thenThrow(new IOException("test"));
		AnalyzeException analyzeException = assertThrows(AnalyzeException.class, () -> logAnalyzer.analyze(null));
		Throwable throwable = analyzeException.getCause();
		assertTrue(throwable instanceof IOException);
		assertEquals("test", throwable.getMessage());
	}

}
