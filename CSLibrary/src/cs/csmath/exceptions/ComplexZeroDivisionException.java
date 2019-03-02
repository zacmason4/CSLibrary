package cs.csmath.exceptions;

/**
 * Exception that indicates an attempt to divide by zero.
 *
 * @author Zac Mason and Dr. Sigman
 * @version 2/14/2019
 */
public class ComplexZeroDivisionException extends RuntimeException {
    public ComplexZeroDivisionException() {
        super("Division By Zero");
    }
}