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

    public static final String EXPECTED_DESCRIPTION = "Figure\npole 12.0\nobwód 16.0";
    @Mock
    // zastepuje         testFigureMock = Mockito.mock(Figure.class);
    private Figure testFigureMock;

    @BeforeEach
    void setUp() {
        Mockito.when(testFigureMock.calculateArea()).thenReturn(12.0);
        Mockito.when(testFigureMock.calculatePerimeter()).thenReturn(16.0);
        Mockito.when(testFigureMock.getType()).thenReturn("Figure");
        Mockito.when(testFigureMock.prepareDescription()).thenCallRealMethod();
    }

    @Test
    void prepareDescription() {
        assertEquals(EXPECTED_DESCRIPTION, testFigureMock.prepareDescription());
    }
}
