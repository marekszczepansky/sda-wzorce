package sda.szczepanski.figures;

public class Circle implements Figure {
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
}
