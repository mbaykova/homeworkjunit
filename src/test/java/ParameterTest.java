import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.aplana.demo.Rectangle;

/**
 * Created by Maria on 26.10.2018.
 */
public class ParameterTest {


	@ParameterizedTest
	@CsvSource({ "1, 1, 1", "2, 2, 4"})
	@DisplayName("Тест с параметрами")
	void testParams(double a, double b, double square){
		Assertions.assertEquals(square, new Rectangle(a, b).calculateSquare());

	}
}
