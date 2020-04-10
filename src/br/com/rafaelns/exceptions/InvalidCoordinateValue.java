package br.com.rafaelns.exceptions;

public class InvalidCoordinateValue extends RuntimeException {
    public InvalidCoordinateValue(String message) {
        super(message);
    }
}
