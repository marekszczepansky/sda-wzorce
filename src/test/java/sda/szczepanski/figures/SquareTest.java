package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    public static final double TEST_SIDE = 10.0;
    public static final double EXPECTED_PERIMETER = 40.0;
    public static final double EXPECTED_AREA = 100.0;
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
}
