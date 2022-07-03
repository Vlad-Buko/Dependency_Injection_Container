package com.by.container.exception;

/**
 * Created by Vladislav Domaniewski
 */

public class TooManyConstructorsException extends Exception {
    public TooManyConstructorsException(String message) {
        super(message);
    }
}
