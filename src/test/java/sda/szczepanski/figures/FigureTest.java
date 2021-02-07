package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FigureTest {

    public static final String TEST_TYPE = "Figura";
    public static final double TEST_AREA = 321.0;
    public static final double TEST_PERIMETER = 123.0;
    @Mock
    private Figure testFigureMock;

    @Test
    void shouldPrepareDescription() {
        when(testFigureMock.getType()).thenReturn(TEST_TYPE);
        when(testFigureMock.calculateArea()).thenReturn(TEST_AREA);
        when(testFigureMock.calculatePerimeter()).thenReturn(TEST_PERIMETER);
        when(testFigureMock.prepareDescription()).thenCallRealMethod();
        String expectedDescription = "\nFigura: " + TEST_TYPE +
                "\npole: " + TEST_AREA +
                "\nobwód: " + TEST_PERIMETER;


        final String actualDescription = testFigureMock.prepareDescription();

        assertEquals(expectedDescription, actualDescription);

    }
}
