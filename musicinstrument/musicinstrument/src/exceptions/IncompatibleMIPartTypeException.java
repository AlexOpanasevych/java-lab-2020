package musicinstrument.src.exceptions;

public class IncompatibleMIPartTypeException extends Exception {
    public IncompatibleMIPartTypeException() {
        super("Incompatible music instrument part trying to add, try another");
    }
}
