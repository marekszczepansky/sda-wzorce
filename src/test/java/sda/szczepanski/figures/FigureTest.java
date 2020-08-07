package sda.szczepanski.figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FigureTest {

    public static final String TEST_TYPE = "Figure";
    public static final double TEST_AREA = 12.0;
    public static final double TEST_PERIMETER = 16.0;
    public static final String EXPECTED_DESCRIPTION =
            TEST_TYPE +
                    "\npole " + TEST_AREA +
                    "\nobwód " + TEST_PERIMETER;

    @Mock
    // zastepuje testFigureMock = Mockito.mock(Figure.class);
    private Figure testFigureMock;

    @BeforeEach
    void setUp() {
        Mockito.when(testFigureMock.calculateArea()).thenReturn(TEST_AREA);
        Mockito.when(testFigureMock.calculatePerimeter()).thenReturn(TEST_PERIMETER);
        Mockito.when(testFigureMock.getType()).thenReturn(TEST_TYPE);
        Mockito.when(testFigureMock.prepareDescription()).thenCallRealMethod();
    }

    @Test
    void prepareDescription() {
        assertEquals(EXPECTED_DESCRIPTION, testFigureMock.prepareDescription());
        // poniższe sprawdzenia nie są wymagane, Mockito wykonuje je automatycznie
        Mockito.verify(testFigureMock, Mockito.times(1)).getType();
        Mockito.verify(testFigureMock, Mockito.times(1)).calculateArea();
        Mockito.verify(testFigureMock, Mockito.times(1)).calculatePerimeter();
    }
}
