package sda.szczepanski.figures;

public class Square implements Figure {

    public static final String TYPE_NAME = "Kwadrat";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getType() {
        return TYPE_NAME;
    }
}