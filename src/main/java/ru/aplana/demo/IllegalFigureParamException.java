package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public class IllegalFigureParamException extends RuntimeException {

	public IllegalFigureParamException(String errorMessage) {
		super(errorMessage);
	}
}
