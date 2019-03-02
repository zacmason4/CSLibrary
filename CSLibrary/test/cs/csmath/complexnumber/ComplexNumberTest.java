package cs.csmath.complexnumber;

import org.junit.Test;

import static org.junit.Assert.*;

import cs.csmath.exceptions.ComplexZeroDivisionException;

import org.junit.Rule;

import org.junit.rules.ExpectedException;

public class ComplexNumberTest {

    @Rule public ExpectedException exception = ExpectedException.none();

    @Test
    public void testAddPos() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(3, 5);
        cn1.add(cn2);
        assertEquals(5, cn1.getRealPart(), 0.000001);
        assertEquals(9, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testAddPosNeg() {
        ComplexNumber cn1 = new ComplexNumber(2, 4);
        ComplexNumber cn2 = new ComplexNumber(-3, -5);
        cn1.add(cn2);
        assertEquals(-1, cn1.getRealPart(), 0.000001);
        assertEquals(-1, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testAddNeg() {
        ComplexNumber cn1 = new ComplexNumber(-2,-4);
        ComplexNumber cn2 = new ComplexNumber(-3, -5);
        cn1.add(cn2);
        assertEquals(-5, cn1.getRealPart(), 0.000001);
        assertEquals(-9, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testAddZero() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(0, 0);
        cn1.add(cn2);
        assertEquals(2, cn1.getRealPart(), 0.000001);
        assertEquals(4, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testSubPos() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(3, 5);
        cn1.sub(cn2);
        assertEquals(-1, cn1.getRealPart(), 0.000001);
        assertEquals(-1, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testSubPosNeg() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(-3, -5);
        cn1.sub(cn2);
        assertEquals(5, cn1.getRealPart(), 0.000001);
        assertEquals(9, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testSubNeg() {
        ComplexNumber cn1 = new ComplexNumber(-2,-4);
        ComplexNumber cn2 = new ComplexNumber(-3, -5);
        cn1.sub(cn2);
        assertEquals(1, cn1.getRealPart(), 0.000001);
        assertEquals(1, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testSubZero() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(0, 0);
        cn1.sub(cn2);
        assertEquals(2, cn1.getRealPart(), 0.000001);
        assertEquals(4, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testMultSquare() {
        ComplexNumber cn1 = new ComplexNumber(0.5, 0.5);
        cn1.mult(cn1);
        assertEquals(0, cn1.getRealPart(), 0.000001);
        assertEquals(0.5, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testMultPos() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(3, 5);
        cn1.mult(cn2);
        assertEquals(-14, cn1.getRealPart(), 0.000001);
        assertEquals(22, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testMultPosNeg() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(-3, -5);
        cn1.mult(cn2);
        assertEquals(14, cn1.getRealPart(), 0.000001);
        assertEquals(-22, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testMultNeg() {
        ComplexNumber cn1 = new ComplexNumber(-2,-4);
        ComplexNumber cn2 = new ComplexNumber(-3, -5);
        cn1.mult(cn2);
        assertEquals(-14, cn1.getRealPart(), 0.000001);
        assertEquals(22, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testMultZero() {
        ComplexNumber cn1 = new ComplexNumber(2,4);
        ComplexNumber cn2 = new ComplexNumber(0, 0);
        cn1.mult(cn2);
        assertEquals(0, cn1.getRealPart(), 0.000001);
        assertEquals(0, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testDivPos() {
        ComplexNumber cn1 = new ComplexNumber(2,3);
        ComplexNumber cn2 = new ComplexNumber(4, 5);
        cn1.div(cn2);
        assertEquals(0.560976, cn1.getRealPart(), 0.000001);
        assertEquals(0.048780, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testDivPosNeg() {
        ComplexNumber cn1 = new ComplexNumber(2,3);
        ComplexNumber cn2 = new ComplexNumber(-4, -5);
        cn1.div(cn2);
        assertEquals(-0.560976, cn1.getRealPart(), 0.000001);
        assertEquals(-0.048780, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testDivNeg() {
        ComplexNumber cn1 = new ComplexNumber(-2,-3);
        ComplexNumber cn2 = new ComplexNumber(-4, -5);
        cn1.div(cn2);
        assertEquals(0.560976, cn1.getRealPart(), 0.000001);
        assertEquals(0.048780, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testDivZero() {
        ComplexNumber cn1 = new ComplexNumber(2,3);
        ComplexNumber cn2 = new ComplexNumber(0, 0);
        exception.expect(ComplexZeroDivisionException.class);
        cn1.div(cn2);
        assertEquals(2, cn1.getRealPart(), 0.000001);
        assertEquals(3, cn1.getImagPart(), 0.000001);
    }

    @Test
    public void testConjPos() {
        ComplexNumber cn = new ComplexNumber(1.7, 3.3);
        cn.conj();
        assertEquals(1.7, cn.getRealPart(), 0.000001);
        assertEquals(-3.3, cn.getImagPart(), 0.000001);
    }

    @Test
    public void testConjPosNeg() {
        ComplexNumber cn = new ComplexNumber(1.7, -3.3);
        cn.conj();
        assertEquals(1.7, cn.getRealPart(), 0.000001);
        assertEquals(3.3, cn.getImagPart(), 0.000001);
    }

    @Test
    public void testConjNeg() {
        ComplexNumber cn = new ComplexNumber(-1.7, -3.3);
        cn.conj();
        assertEquals(-1.7, cn.getRealPart(), 0.000001);
        assertEquals(3.3, cn.getImagPart(), 0.000001);
    }

    @Test
    public void testConjZero() {
        ComplexNumber cn = new ComplexNumber(1.7, 0);
        cn.conj();
        assertEquals(1.7, cn.getRealPart(), 0.000001);
        assertEquals(0, cn.getImagPart(), 0.000001);
    }

    @Test
    public void testAbsPos() {
        ComplexNumber cn = new ComplexNumber(3, 4);
        double magnitude = cn.abs();
        assertEquals(5, magnitude, 0.000001);
    }

    @Test
    public void testAbsPosNeg() {
        ComplexNumber cn = new ComplexNumber(3, -4);
        double magnitude = cn.abs();
        assertEquals(5, magnitude, 0.000001);
    }

    @Test
    public void testAbsNeg() {
        ComplexNumber cn = new ComplexNumber(-3, -4);
        double magnitude = cn.abs();
        assertEquals(5, magnitude, 0.000001);
    }

    @Test
    public void testAbsZero() {
        ComplexNumber cn = new ComplexNumber(3, 0);
        double magnitude = cn.abs();
        assertEquals(3, magnitude, 0.000001);
    }

    @Test
    public void testGetRealPart() {
        ComplexNumber cn = new ComplexNumber(1.7, -3.3);
        double realPart = cn.getRealPart();
        assertEquals("Test getRealPart with 1.7", 1.7, realPart, 0.000001);
    }

    @Test
    public void testSetRealPart() {
        ComplexNumber cn = new ComplexNumber(1.7, -3.3);
        cn.setRealPart(5);
        assertEquals(5, cn.getRealPart(), 0.000001);
    }

    @Test
    public void testGetImagPart() {
        ComplexNumber cn = new ComplexNumber(1.7, -3.3);
        double imagPart = cn.getImagPart();
        assertEquals("Test getImagPart with -3.3", -3.3, imagPart, 0.000001);
    }

    @Test
    public void testSetImagPart() {
        ComplexNumber cn = new ComplexNumber(1.7, -3.3);
        cn.setImagPart(5);
        assertEquals(5, cn.getImagPart(), 0.000001);
    }
}