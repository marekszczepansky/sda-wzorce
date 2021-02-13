package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private static final double SIDE_A = 2;
    private static final double SIDE_B = 4;
    private static final double TEST_AREA = 12;
    private static final double TEST_PERIMETER = 8;
    private static final double TEST_X = 10.0;
    private static final double TEST_Y = 20.0;
    private static final Colourable.Colour TEST_COLOUR = Colourable.Colour.RED;
    private Rectangle testRectangle;

    @BeforeEach
    void setUp() {
        testRectangle = new Rectangle.Builder()
                .withColour(TEST_COLOUR)
                .withCoordinates(TEST_X, TEST_Y)
                .withSideA(SIDE_A)
                .withSideB(SIDE_B)
                .build();
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(TEST_PERIMETER, testRectangle.calculatePerimeter());
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(TEST_AREA, testRectangle.calculateArea());
    }

    @Test
    void shouldSetColour() {
        assertEquals(TEST_COLOUR, testRectangle.getColour());
    }

    @Test
    void shouldSetCoordinates() {
        assertEquals(TEST_X, testRectangle.getX());
        assertEquals(TEST_Y, testRectangle.getY());
    }
}