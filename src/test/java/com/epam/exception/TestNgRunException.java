package com.epam.exception;

/**
 * @author kedr
 * 
 *         Exception error running Test NG suite
 */
public class TestNgRunException extends RuntimeException {

    private static final long serialVersionUID = -2438157347919163030L;

    public TestNgRunException(String msg) {
	super(msg);
    }

}
