package sda.szczepanski.figures;

import static java.lang.Math.sqrt;

public class RightTriangle implements SuperFigure{
    public static final String TYPE_NAME = "Trójkąt prostokątny";
    private double base;
    private double height;
    private Colour colour;
    private double x;
    private double y;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    private RightTriangle(Builder builder) {
        this.base = builder.base;
        this.colour = builder.colour;
        this.height = builder.height;
        this.x = builder.x;
        this.y = builder.y;
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

        private double height;
        private double base;
        private Colour colour;
        private double x;
        private double y;

        public RightTriangle build() {
            if (height <= 0 || base <= 0) {
                throw new IllegalStateException("Base and height must be greater than 0");
            }
            return new RightTriangle(this);
        }

        public Builder withBase(double base) {
            this.base = base;
            return this;
        }
        public Builder withHeight(double height) {
            this.height = height;
            return this;
        }

        protected Builder withColour(Colour colour) {
            this.colour = colour;
            return this;
        }

        protected Builder withCoordinates(double x, double y) {
            this.x = x;
            this.y = y;
            return this;
        }
    }
}
