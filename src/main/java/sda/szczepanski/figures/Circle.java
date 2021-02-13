package sda.szczepanski.figures;

public class Circle implements SuperFigure {
    public static final String TYPE_NAME = "Koło";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
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
