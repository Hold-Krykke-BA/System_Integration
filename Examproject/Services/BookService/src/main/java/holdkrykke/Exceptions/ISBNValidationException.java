package holdkrykke.Exceptions;

public class ISBNValidationException extends Exception{

    public ISBNValidationException(String message) {
        super(message);
    }

    public ISBNValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
