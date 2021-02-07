package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    private static final double TEST_BASE = 3;
    private static final double TEST_HEIGHT = 4;
    private static final int EXPECTED_AREA = 6;
    private static final int EXPECTED_PERIMETER = 12;
    private RightTriangle testTriangle;

    @BeforeEach
    void setUp() {
        testTriangle = new RightTriangle(TEST_BASE, TEST_HEIGHT);
    }

    @Test
    void shouldCalculatePerimeter() {
        final double actualPerimeter = testTriangle.calculatePerimeter();

        assertEquals(EXPECTED_PERIMETER, actualPerimeter);
    }

    @Test
    void shouldCalculateArea() {
        final double actualArea = testTriangle.calculateArea();

        assertEquals(EXPECTED_AREA, actualArea);
    }
}