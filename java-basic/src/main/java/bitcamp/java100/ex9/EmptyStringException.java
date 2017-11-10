package bitcamp.java100.ex9;

public class EmptyStringException extends Exception{

    public EmptyStringException() {
        super();
    }

    public EmptyStringException(String message) {
        super(message);
    }
}
