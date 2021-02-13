package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    private static final double TEST_SIDE = 3;
    private static final double EXPECTED_AREA = 9;
    private static final double EXPECTED_PERIMETER = 12;
    private static final double TEST_X = 10.0;
    private static final double TEST_Y = 20.0;
    private static final Colourable.Colour TEST_COLOUR = Colourable.Colour.RED;

    private Square testSquare;

    @BeforeEach
    void setUp() {
        testSquare = new Square(TEST_SIDE);
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(EXPECTED_PERIMETER, testSquare.calculatePerimeter());
    }
    @Test
    void shouldCalculateArea() {
        assertEquals(EXPECTED_AREA, testSquare.calculateArea());
    }

    @Test
    void shouldSetColour() {
        testSquare.setColour(TEST_COLOUR);

        assertEquals(TEST_COLOUR, testSquare.getColour());
    }

    @Test
    void shouldSetCoordinates() {
        testSquare.setCoordinates(TEST_X, TEST_Y);

        assertEquals(TEST_X, testSquare.getX());
        assertEquals(TEST_Y, testSquare.getY());
    }
}
