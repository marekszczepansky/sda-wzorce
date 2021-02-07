package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private static final int TEST_RADIUS = 5;
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

}