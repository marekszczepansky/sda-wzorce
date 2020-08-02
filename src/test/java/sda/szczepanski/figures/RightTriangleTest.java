package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    public static final int TEST_BASE = 3;
    public static final int TEST_HEIGHT = 4;
    public static final double EXPECTED_AREA = TEST_BASE * TEST_HEIGHT / 2.0;
    public static final int HYPOTENUSE = 5;
    public static final int EXPECTED_PERIMETER = TEST_BASE + TEST_HEIGHT + HYPOTENUSE;
    public static final Colourable.Colour TEST_COLOUR = Colourable.Colour.RED;
    public static final double TEST_X = 12.0;
    public static final double TEST_Y = 3.14;
    private RightTriangle testTriangle;

    @BeforeEach
    void setUp() {
        testTriangle = new RightTriangle.Builder()
                .withBase(TEST_BASE)
                .withHeight(TEST_HEIGHT)
                .withColour(TEST_COLOUR)
                .withCoordinates(TEST_X, TEST_Y)
                .build();
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(EXPECTED_AREA, testTriangle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(EXPECTED_PERIMETER, testTriangle.calculatePerimeter());
    }

    @Test
    void shouldSetColourByBuilder() {
        assertEquals(TEST_COLOUR, testTriangle.getColour());
    }

    @Test
    void shouldSetCoordinatesByBuilder() {
        assertEquals(TEST_X, testTriangle.getX());
        assertEquals(TEST_Y, testTriangle.getY());
    }

    @Test
    void shouldThrowExceptionForUnsetValies () {
        assertThrows(IllegalStateException.class, () -> new RightTriangle.Builder().build());
    }
}
