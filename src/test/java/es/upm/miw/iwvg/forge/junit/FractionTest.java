package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {
    private Fraction fraction;
    private Fraction defaultFraction, fractionToCompare;

    @BeforeEach
    void before() {
        fraction = new Fraction(3, 4);
        fractionToCompare = new Fraction(1, 2);
        defaultFraction = new Fraction();
    }

    @Test
    void testFractionIntInt() {
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        assertEquals(1, defaultFraction.getNumerator());
        assertEquals(1, defaultFraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.75, fraction.decimal(), 10e-5);
    }

    @Test
    void testIsGreaterThan() {
        assertEquals(true, fraction.isGreaterThan(fractionToCompare));
    }

    @Test
    void testIsGreaterThanFalse() {
        assertEquals(false, fractionToCompare.isGreaterThan(fraction));
    }

    @Test
    void testIsLowerThan() {
        assertEquals(true, fractionToCompare.isLowerThan(fraction));
    }

    @Test
    void testIsLowerThanFalse() {
        assertEquals(false, fraction.isLowerThan(fractionToCompare));
    }

    @Test
    void testIsProper() {
        assertTrue(fractionToCompare.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction improper = new Fraction(2,2);
        assertTrue(improper.isImproper());
    }

    @Test
    void testIsEquivalente(){
        fraction = new Fraction(1,2);
        assertTrue(fraction.isEquivalent(new Fraction(2,4)));
    }

    @Test
    void testIsEquivalenteFalse(){
        fraction = new Fraction(1,2);
        assertEquals(false,fraction.isEquivalent(new Fraction(3,4)));
    }

}