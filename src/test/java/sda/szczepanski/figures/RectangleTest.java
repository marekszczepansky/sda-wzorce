package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private static final double SIDE_A = 2;
    private static final double SIDE_B = 4;
    private static final double TEST_AREA = 12;
    private static final double TEST_PERIMETER = 8;
    private Rectangle testRectangle;

    @BeforeEach
    void setUp() {
        testRectangle = new Rectangle(SIDE_A, SIDE_B);
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(TEST_PERIMETER, testRectangle.calculatePerimeter());
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(TEST_AREA, testRectangle.calculateArea());
    }
}