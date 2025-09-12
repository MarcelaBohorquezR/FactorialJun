package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    void testFactorial0() {
        // Prueba el factorial de 0
        assertEquals(1, Factorial.calcularFactorial(0));
    }

    @Test
    void testFactorial1() {
        // Prueba el factorial de 1
        assertEquals(1, Factorial.calcularFactorial(1));
    }

    @Test
    void testFactorial5() {
        // Prueba el factorial de 5
        assertEquals(120, Factorial.calcularFactorial(5));
    }

    @Test
    void testFactorial7() {
        // Prueba el factorial de 7
        assertEquals(5040, Factorial.calcularFactorial(7));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        // Prueba si la función lanza una excepción para números negativos
        assertThrows(IllegalArgumentException.class, () -> Factorial.calcularFactorial(-5));
    }
}
