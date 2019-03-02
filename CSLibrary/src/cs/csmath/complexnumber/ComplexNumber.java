package cs.csmath.complexnumber;

import cs.csmath.exceptions.ComplexZeroDivisionException;

public class ComplexNumber {
    private double realPart;
    private double imagPart;


    //------------- Constructors -----------------/
    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public ComplexNumber() {
        this(0.0, 0.0);
    }


    //--------------- Methods -------------------/
    public void add(ComplexNumber otherCN) {
        this.realPart = this.realPart + otherCN.realPart;
        this.imagPart += otherCN.imagPart;
    }

    public void sub(ComplexNumber otherCN) {
        this.realPart = this.realPart - otherCN.realPart;
        this.imagPart = this.imagPart - otherCN.imagPart;
    }

    public void mult(ComplexNumber otherCN) {
        //double originalRealPart = this.realPart;
        //double otherOriginalRealPart = otherCN.realPart;
        double newRealPart = this.realPart * otherCN.realPart - this.imagPart * otherCN.imagPart;
        this.imagPart = this.imagPart * otherCN.realPart + this.realPart * otherCN.imagPart;

        this.realPart = newRealPart;
    }

    public void div(ComplexNumber otherCN) {
        double divisor = (otherCN.realPart * otherCN.realPart) + (otherCN.imagPart * otherCN.imagPart);
        double newRealPart = ((this.realPart * otherCN.realPart) + (this.imagPart * otherCN.imagPart)) / divisor;
        this.imagPart = ((this.imagPart * otherCN.realPart) - (this.realPart * otherCN.imagPart)) / divisor;

        this.realPart = newRealPart;

        if (divisor == 0) {
            throw new ComplexZeroDivisionException();
        }
    }

    public ComplexNumber conj() {
        this.imagPart = this.imagPart * -1;
        ComplexNumber value = new ComplexNumber(this.realPart, this.imagPart);
        return value;
    }

    public double abs() {
        return Math.sqrt(this.realPart * this.realPart + this.imagPart * this.imagPart);
    }

    public String toString() {
        String val = "" + this.realPart + " + " + this.imagPart + "i";
        return val;
    }

    public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
        return null;
    }

    //------------- Getters & Setters -----------/
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart) {
        this.imagPart = imagPart;
    }

    //-------------- Testing -----------------/
    public static void main(String [] args) {
        ComplexNumber cn1 = new ComplexNumber(2, 3.5);
        System.out.println("Print the value of cn1: 2 + 3.5i");
        System.out.println("real: " + cn1.getRealPart());
        System.out.println("imag: " + cn1.getImagPart());

        ComplexNumber cn2 = new ComplexNumber(4.0, 1.3);
        cn1.add(cn2);
        System.out.println("The sum of cn1 and cn2 is: 6.0 + 4.8i");
        System.out.println("real: " + cn1.getRealPart());
        System.out.println("imag: " + cn1.getImagPart());

        System.out.println("toString Test: " + cn1);

        System.out.println("Mult Test: 4.31 - 0.1i ");
        ComplexNumber cn3 = new ComplexNumber(0.5, 0.5);
        ComplexNumber cn4 = new ComplexNumber(-0.41, 8.4);
        cn3.mult(cn3);
        System.out.println(cn3);

        System.out.println("Conj Test: 2 - 3.5i");
        ComplexNumber cn5 = new ComplexNumber(2, 3.5);
        cn5.conj();
        System.out.println("Conj Test Result: " + cn5);

        System.out.println("Abs Test: 5");
        ComplexNumber cn6 = new ComplexNumber(3, 4);
        double magnitude = cn6.abs();
        System.out.println("Abs Test Result: " + magnitude);

        ComplexNumber cn7 = new ComplexNumber(4.0, 1.0);
        ComplexNumber cn8 = new ComplexNumber(2.0, 0.5);
        cn7.sub(cn8);
        System.out.println("The difference between cn7 and cn8 is: 2.0 + 0.5i");
        System.out.println("real: " + cn7.getRealPart());
        System.out.println("imag: " + cn7.getImagPart());

        System.out.println("Div Test: -0.14027 + 1.94570i ");
        ComplexNumber cn9 = new ComplexNumber(2.0, 2.1);
        ComplexNumber cn10 = new ComplexNumber(1.0, -1.1);
        cn9.div(cn10);
        System.out.println("Div Test Result: " + cn9);
    }
}
