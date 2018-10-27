import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.aplana.demo.Circle;
import ru.aplana.demo.Rectangle;
import ru.aplana.demo.Triangle;

/**
 * Created by Maria on 20.10.2018.
 */
public class FigureTest {

	@Test
	public void testCirclePerimeter(){
		Circle circle = new Circle(2);
		Assert.assertEquals(2 * Math.PI * 2, circle.calculatePerimeter(), 0.01);
	}


	@Test
	public void testCircleSquare(){
		Circle circle = new Circle(2);
		Assert.assertEquals(Math.PI * 4, circle.calculateSquare(), 0.01);
	}


	@Test
	public void testTrianglePerimeter(){
		Triangle triangle = new Triangle(1, 1, 1);
		Assert.assertEquals(3, triangle.calculatePerimeter(), 0);
	}


	@Test
	public void testTriangleSquare(){
		Triangle triangle = new Triangle(1, 1, 1);
		Assert.assertEquals(Math.sqrt(1.5 * 0.5 * 0.5 * 0.5), triangle.calculateSquare(), 0);
	}


	@Test
	public void testRectanglePerimeter(){
		Rectangle rectangle = new Rectangle(2, 2);
		Assert.assertEquals(8, rectangle.calculatePerimeter(), 0);
	}


	@Test
	public void testRectangleSquare(){
		Rectangle rectangle = new Rectangle(2, 2);
		Assert.assertEquals(4, rectangle.calculateSquare(), 0);
	}
}
