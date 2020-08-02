package sda.szczepanski.figures;

public class RightTriangle implements SuperFigure {
    private double base;
    private double height;
    private double hypotenuse;
    private Colour colour;
    private double x;
    private double y;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(this.base * this.base + this.height * this.height);
    }

    private RightTriangle(Builder builder) {
        this.base = builder.base;
        this.colour = builder.colour;
        this.height = builder.height;
        this.x = builder.x;
        this.y = builder.y;
        this.hypotenuse = Math.sqrt(this.base * this.base + this.height * this.height);
    }

    @Override
    public double calculatePerimeter() {
        return base + height + hypotenuse;
    }

    @Override
    public double calculateArea() {
        return base * height / 2.0;
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

        private Colour colour;
        private double height;
        private double x;
        private double y;
        private double base;

        RightTriangle build() {
            return new RightTriangle(this);
        }

        // TODO: Proszę zaimplementować metody buildera

    }
}
