import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aplana.demo.IllegalFigureParamException;
import ru.aplana.demo.Rectangle;

/**
 * Created by Maria on 26.10.2018.
 */
public class ExceptionTest {

	@Test
	void divisionTest(){
		Throwable exception = Assertions.assertThrows(IllegalFigureParamException.class,
			() -> {new Rectangle(1,0).calculatePerimeter();});

		Assertions.assertEquals("стороны должны быть положительным числом!", exception.getMessage());
	}
}
