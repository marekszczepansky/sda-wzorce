package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    public static final int BASE = 3;
    public static final int HEIGHT = 4;
    public static final double EXPECTED_AREA = BASE * HEIGHT / 2.0;
    public static final int HYPOTENUSE = 5;
    public static final int EXPECTED_PERIMETER = BASE + HEIGHT + HYPOTENUSE;
    private RightTriangle testTriangle;

    @BeforeEach
    void setUp() {
        testTriangle = new RightTriangle(BASE, HEIGHT);
    }

    @Test
    void shouldCalculateArea() {
        assertEquals(EXPECTED_AREA, testTriangle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeter() {
        assertEquals(EXPECTED_PERIMETER, testTriangle.calculatePerimeter());
    }
}
