package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public class Triangle implements IFigure {

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			throw new IllegalFigureParamException("стороны должны быть положительным числом!");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calculatePerimeter() {
		return a + b + c;
	}

	public double calculateSquare() {
		double p = calculatePerimeter()/2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}


}
