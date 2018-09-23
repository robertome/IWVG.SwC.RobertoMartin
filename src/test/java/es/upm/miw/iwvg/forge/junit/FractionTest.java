package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}