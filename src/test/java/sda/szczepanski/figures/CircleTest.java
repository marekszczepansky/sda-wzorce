package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private static final int TEST_RADIUS = 5;
    private static final double TEST_X = 10.0;
    private static final double TEST_Y = 20.0;
    private static final Colourable.Colour TEST_COLOUR = Colourable.Colour.RED;

    private Circle testCircle;

    @BeforeEach
    void setUp() {
        testCircle = new Circle(TEST_RADIUS);
    }

    @Test
    void shouldCalculateArea() {
        //given
        final double expectedArea = Math.PI * TEST_RADIUS * TEST_RADIUS;

        //when
        final double actualArea = testCircle.calculateArea();

        //then
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void shouldCalculatePerimeter() {
        final double expectedPerimeter = 2 * Math.PI * TEST_RADIUS;

        final double actualPerimeter = testCircle.calculatePerimeter();

        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void shouldSetColour() {
        testCircle.setColour(TEST_COLOUR);

        assertEquals(TEST_COLOUR, testCircle.getColour());
    }

    @Test
    void shouldSetCoordinated() {
        testCircle.setCoordinates(TEST_X, TEST_Y);

        assertEquals(TEST_X, testCircle.getX());
        assertEquals(TEST_Y, testCircle.getY());
    }
}