package com.stackroute.buzzup.exception;

public class TheatreAlreadyExistsException extends Exception {
	private static final long serialVersionUID = 1L;

	public TheatreAlreadyExistsException(String message) {
        super(message);
    }
}
