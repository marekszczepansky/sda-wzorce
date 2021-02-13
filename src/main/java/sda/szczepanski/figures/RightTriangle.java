package sda.szczepanski.figures;

import static java.lang.Math.sqrt;

public class RightTriangle implements SuperFigure{
    public static final String TYPE_NAME = "Trójkąt prostokątny";
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return base + height + sqrt(base * base + height * height);
    }

    @Override
    public double calculateArea() {
        return base * height / 2.0;
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
