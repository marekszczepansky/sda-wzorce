package sda.szczepanski.figures;


public class FigureFactory {
    private final static double DEFAULT_Y_COORDINATE = 0.0;
    private final static double DEFAULT_X_COORDINATE = 0.0;
    private final static Colourable.Colour DEFAULT_COLOUR = Colourable.Colour.GREEN;
    private final Colourable.Colour defaultColour;
    private final double defaultXCoordinate;
    private final double defaultYCoordinate;

    public static enum FigureType {
        CIRCLE, SQUARE, RIGHT_TRIANGLE, RECTANGLE
    }

    public static SuperFigure createDefaultFigure(FigureType figureType, double size){
        return getSuperFigure(figureType, size, DEFAULT_COLOUR, DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE);
    };

    public static SuperFigure createDefaultFigure(FigureType figureType, double sizeA, double sizeB){
        return getSuperFigure(figureType, sizeA, sizeB, DEFAULT_COLOUR, DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE);
    };

    public FigureFactory(Colourable.Colour defaultColour,
                         double defaultXCoordinate,
                         double defaultYCoordinate) {
        this.defaultColour = defaultColour;
        this.defaultXCoordinate = defaultXCoordinate;
        this.defaultYCoordinate = defaultYCoordinate;
    }

    public SuperFigure createFigure(FigureType figureType, double size){
        return getSuperFigure(figureType, size, defaultColour, defaultXCoordinate, defaultYCoordinate);
    }

    public SuperFigure createFigure(FigureType figureType, double sizeA, double sizeB){
        return getSuperFigure(figureType, sizeA, sizeB, defaultColour, defaultXCoordinate, defaultYCoordinate);
    }

    private static SuperFigure getSuperFigure(FigureType figureType, double size, Colourable.Colour colour, double defaultXCoordinate, double defaultYCoordinate) {
        switch (figureType) {
            case CIRCLE:
                return new Circle.Builder()
                        .withRadius(size)
                        .withColour(colour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            case SQUARE:
                return new Square.Builder()
                        .withSide(size)
                        .withColour(colour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            default:
                throw new IllegalArgumentException("This figure requires more size arguments");
        }
    }

    private static SuperFigure getSuperFigure(FigureType figureType, double sizeA, double sizeB, Colourable.Colour colour, double defaultXCoordinate, double defaultYCoordinate) {
        switch (figureType) {
            case RIGHT_TRIANGLE:
                return new RightTriangle.Builder()
                        .withBase(sizeA)
                        .withHeight(sizeB)
                        .withColour(colour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            case RECTANGLE:
                return new Rectangle.Builder()
                        .withSideA(sizeA)
                        .withSideB(sizeB)
                        .withColour(colour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            default:
                throw new IllegalArgumentException("This figure requires only one size argument");
        }
    }
}
