package exception;

public class TooManyProductsException extends RuntimeException {

    public TooManyProductsException() {
        super("You cannot add more products. The shop is full.");
    }
}
