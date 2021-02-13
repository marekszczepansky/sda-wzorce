package sda.szczepanski.figures;

public class Rectangle implements SuperFigure {

    public static final String TYPE_NAME = "Prostokąt";
    double sideA;
    double sideB;
    private Colour colour;
    private double x;
    private double y;

    public Rectangle(double sideA, double SideB) {
        this.sideA = sideA;
        this.sideB = SideB;
    }

    @Override
    public double calculatePerimeter() {
        return sideA * sideB;
    }

    @Override
    public double calculateArea() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String getType() {
        return TYPE_NAME;
    }

    @Override
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    @Override
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
}
