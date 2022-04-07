package Exceptions;

public class JsonFileNotFoundException extends RuntimeException{
    public JsonFileNotFoundException(String message) {
        super(message);
    }
}
