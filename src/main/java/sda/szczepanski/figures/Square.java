package sda.szczepanski.figures;

public class Square implements SuperFigure {
    private double side;
    private Colour colour;
    private double x;
    private double y;

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

    public static class Builder {

        Square build(){
            return new Square(-1.0);
        }

        Builder withSide(double side){
            // ...
            return this;
        }

        Builder withColour(Colour colour) {
            // ...
            return this;
        }

        Builder withCoordinates(double x, double y){
            // ...
            return this;
        }
    }
}
