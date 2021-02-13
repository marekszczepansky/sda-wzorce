package sda.szczepanski.figures;

public class Rectangle implements SuperFigure {

    public static final String TYPE_NAME = "Prostokąt";
    double sideA;
    double sideB;

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

    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void setCoordinates(double x, double y) {

    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }
}
