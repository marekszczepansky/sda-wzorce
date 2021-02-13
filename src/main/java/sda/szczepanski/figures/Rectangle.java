package sda.szczepanski.figures;

public class Rectangle implements SuperFigure {

    public static final String TYPE_NAME = "Prostokąt";
    double sideA;
    double sideB;
    private Colour colour;
    private double x;
    private double y;

    private Rectangle(Builder builder) {
        this.sideA = builder.sideA;
        this.sideB = builder.sideB;
        this.colour = builder.colour;
        this.x = builder.x;
        this.y = builder.y;

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

    public static class Builder {
        private double sideA;
        private double sideB;
        private Colour colour;
        private double x;
        private double y;

        Rectangle build(){
            return new Rectangle(this);
        }

        Builder withSideA(double sideA) {
            this.sideA = sideA;
            return this;
        }

        Builder withSideB(double sideB) {
            this.sideB = sideB;
            return this;
        }

        Builder withColour(Colour colour) {
            this.colour = colour;
            return this;
        }

        Builder withCoordinates(double x, double y) {
            this.x = x;
            this.y = y;
            return this;
        }
    }
}
