package sda.szczepanski.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    private static final double TEST_BASE = 3;
    private static final double TEST_HEIGHT = 4;
    private static final double TEST_HYPOTENUSE = 5;
    private static final int TEST_AREA = 6;
    private static final int TEST_PERIMETER = 12;


    @Test
    void shouldCalculatePerimeter() {
        final RightTriangle testTriangle = new RightTriangle(TEST_BASE, TEST_HEIGHT);
        assertEquals(TEST_PERIMETER, testTriangle.calculatePerimeter());
    }

    @Test
    void shouldCalculateArea() {
        final RightTriangle testTriangle = new RightTriangle(TEST_BASE, TEST_HEIGHT);
        assertEquals(TEST_AREA, testTriangle.calculateArea());
    }
}