package sda.szczepanski.figures;

public class Circle implements SuperFigure {
    private double radius;
    private Colour colour;
    private double x;
    private double y;

    public Circle(double radius) {
        this.radius = radius;
    }

    private Circle() {
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
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }

    @Override
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    public static class Builder {

        private final Circle prototype;

        public Builder() {
            prototype = new Circle();
        }

        Circle build(){
            if (prototype.radius <= 0) {
                throw new IllegalStateException("Circle radius must be greater than zero");
            }
          return prototype;
        };

        Builder withRadius(double radius) {
          prototype.radius = radius;
          return this;
        };

        Builder withColour(Colour colour) {
          prototype.colour = colour;
          return this;
        };

        Builder withCoordinates(double x, double y) {
          prototype.x = x;
          prototype.y = y;
          return this;
        };
    }
}
