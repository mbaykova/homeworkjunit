import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import ru.aplana.demo.Rectangle;

/**
 * Created by Maria on 20.10.2018.
 */
public class CustomRuleTest {

	@Rule
	public CustomRule rule = new CustomRule();

	@Test
	public void rectangleTest() {
		Rectangle rectangle = rule.getRectangle();
		Assert.assertEquals(rule.getA() * rule.getB(), rectangle.calculateSquare(), 0);

	}

	@Test
	public void rectanglePerimeterTest() {
		Rectangle rectangle = rule.getRectangle();
		Assert.assertEquals(2 * (rule.getA() + rule.getB()), rectangle.calculatePerimeter(), 0);

	}


}
