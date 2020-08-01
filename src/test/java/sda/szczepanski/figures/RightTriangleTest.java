package sda.szczepanski.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {

    public static final int BASE = 3;
    public static final int HEIGHT = 4;
    public static final int HYPOTENUSE = 5;

    @Test
    void shouldCalculateArea() {
        RightTriangle testTriangle = new RightTriangle(BASE, HEIGHT);
        assertEquals(BASE * HEIGHT / 2.0, testTriangle.getArea());
    }

    @Test
    void shouldCalculateCircumference() {
        RightTriangle testTriangle = new RightTriangle(BASE, HEIGHT);
        assertEquals(BASE + HEIGHT + HYPOTENUSE, testTriangle.getCircumference());
    }
}
