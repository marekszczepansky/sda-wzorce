package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    public static final double TEST_SIDE_A = 10.0;
    public static final double TEST_SIDE_B = 20.0;
    public static final double EXPECTED_PERIMETER = 60.0;
    public static final double EXPECTED_AREA = 200.0;
    private Rectangle testRectangle;

    @BeforeEach
    void setUp() {
        testRectangle = new Rectangle.Builder()
                .withSideA(TEST_SIDE_A).withSideB(TEST_SIDE_B).build();
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(EXPECTED_PERIMETER, testRectangle.calculatePerimeter());
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(EXPECTED_AREA, testRectangle.calculateArea());
    }
}
