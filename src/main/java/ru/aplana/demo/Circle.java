package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public class Circle implements IFigure {
	private double radius;

	private final static double PI = 3.14;

	public Circle(double radius) {
		if (radius <= 0) {
			throw new IllegalFigureParamException("радиус должен быть положительным числом!");
		}
		this.radius = radius;
	}


	public double calculatePerimeter() {
		return 2 * PI * radius;
	}

	public double calculateSquare() {
		return PI * radius * radius;
	}
}
