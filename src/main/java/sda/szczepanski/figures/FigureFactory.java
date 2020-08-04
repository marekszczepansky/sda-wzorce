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
        switch (figureType) {
            case CIRCLE:
                return new Circle.Builder()
                        .withRadius(size)
                        .withColour(DEFAULT_COLOUR)
                        .withCoordinates(DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE)
                        .build();
            case SQUARE:
                return new Square.Builder()
                        .withSide(size)
                        .withColour(DEFAULT_COLOUR)
                        .withCoordinates(DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE)
                        .build();
            default:
                throw new IllegalArgumentException("This figure requires more size arguments");
        }
    };

    public static SuperFigure createDefaultFigure(FigureType figureType, double sizeA, double sizeB){
        switch (figureType) {
            case RIGHT_TRIANGLE:
                return new RightTriangle.Builder()
                        .withBase(sizeA)
                        .withHeight(sizeB)
                        .withColour(DEFAULT_COLOUR)
                        .withCoordinates(DEFAULT_X_COORDINATE, DEFAULT_Y_COORDINATE)
                        .build();
            case RECTANGLE:
                return new Rectangle(sizeA, sizeB);
            default:
                throw new IllegalArgumentException("This figure requires only one size argument");
        }
    };

    public FigureFactory(Colourable.Colour defaultColour,
                         double defaultXCoordinate,
                         double defaultYCoordinate) {
        this.defaultColour = defaultColour;
        this.defaultXCoordinate = defaultXCoordinate;
        this.defaultYCoordinate = defaultYCoordinate;
    }
    public SuperFigure createFigure(FigureType figureType, double size){
        switch (figureType) {
            case CIRCLE:
                return new Circle.Builder()
                        .withRadius(size)
                        .withColour(defaultColour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            case SQUARE:
                return new Square.Builder()
                        .withSide(size)
                        .withColour(defaultColour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            default:
                throw new IllegalArgumentException("This figure requires more size arguments");
        }
    };

    public SuperFigure createFigure(FigureType figureType, double sizeA, double sizeB){
        switch (figureType) {
            case RIGHT_TRIANGLE:
                return new RightTriangle.Builder()
                        .withBase(sizeA)
                        .withHeight(sizeB)
                        .withColour(defaultColour)
                        .withCoordinates(defaultXCoordinate, defaultYCoordinate)
                        .build();
            case RECTANGLE:
                return new Rectangle(sizeA, sizeB);
            default:
                throw new IllegalArgumentException("This figure requires only one size argument");
        }
    };
}
