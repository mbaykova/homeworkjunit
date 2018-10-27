import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import ru.aplana.demo.Rectangle;

/**
 * Created by Maria on 27.10.2018.
 */
public class CustomRule implements TestRule{

	private Rectangle rectangle;

	private double a;

	private double b;

	public Statement apply(final Statement base, Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				System.out.println("Before test");
				a = getRandom();
				b = getRandom();
				rectangle = new Rectangle(a, b);
				System.out.println(rectangle.toString());
				base.evaluate();

			}
		};
	}

	private double getRandom(){
		return 	1 + Math.random()*40;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}
}
