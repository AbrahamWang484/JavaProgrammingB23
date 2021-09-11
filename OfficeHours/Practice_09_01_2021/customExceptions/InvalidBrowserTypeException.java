package Practice_09_01_2021.customExceptions;

public class InvalidBrowserTypeException extends RuntimeException {


    public InvalidBrowserTypeException(String message) {
        super(message);
    }
}