package br.com.rafaelns.exceptions;

public class DirectionNotFoundException extends RuntimeException {
    public DirectionNotFoundException(String message) {
        super(message);
    }
}
