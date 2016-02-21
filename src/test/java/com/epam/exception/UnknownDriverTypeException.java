package com.epam.exception;

/**
 * @author kedr
 * 
 *         The exception in the absence of the type of browser
 */
public class UnknownDriverTypeException extends RuntimeException {

    private static final long serialVersionUID = 6066267775593475177L;

    public UnknownDriverTypeException(String msg) {
	super(msg);
    }

}
