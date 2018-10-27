package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public class Rectangle implements IFigure {

	private double a;
	private double b;

	public Rectangle(double a, double b) {
		if ((a <= 0) || (b <= 0)) {
			throw new IllegalFigureParamException("стороны должны быть положительным числом!");
		}
		this.a = a;
		this.b = b;
	}

	public double calculatePerimeter() {
		return 2 * (a + b);
	}

	public double calculateSquare() {
		return a * b;
	}

	@Override
	public String toString(){
		return String.format("a = %s; b=%s", a, b);
	}
}
