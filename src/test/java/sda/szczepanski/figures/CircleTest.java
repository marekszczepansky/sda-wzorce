package sda.szczepanski.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    public static final int TEST_RADIUS = 5;

    @Test
    void shouldCalculateArea() {
        Circle testCircle = new Circle(TEST_RADIUS);
        assertEquals(Math.PI * TEST_RADIUS * TEST_RADIUS, testCircle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        Circle testCircle = new Circle(TEST_RADIUS);
        assertEquals(2 * Math.PI * TEST_RADIUS, testCircle.calculatePerimeter());
    }

}