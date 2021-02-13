package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    private static final double TEST_BASE = 3;
    private static final double TEST_HEIGHT = 4;
    private static final int EXPECTED_AREA = 6;
    private static final int EXPECTED_PERIMETER = 12;
    private static final double TEST_X = 10.0;
    private static final double TEST_Y = 20.0;
    private static final Colourable.Colour TEST_COLOUR = Colourable.Colour.RED;

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

    @Test
    void shouldSetColour() {
        testTriangle.setColour(TEST_COLOUR);

        assertEquals(TEST_COLOUR, testTriangle.getColour());
    }

    @Test
    void shouldSetCoordinates() {
        testTriangle.setCoordinates(TEST_X, TEST_Y);

        assertEquals(TEST_X, testTriangle.getX());
        assertEquals(TEST_Y, testTriangle.getY());
    }
}