package sda.szczepanski.figures;

public final class Square extends AbstractSuperFigure {
    private double side;

    private Square() { }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    // implementacja uproszczona i niepolecana
    // może wpływać na logike konstruktora
    public static class Builder {
        private Square instance;

        public Builder() {
            instance = new Square();
        }

        public Square build() {
            if (instance.side <= 0) {
                throw new IllegalStateException("Square side must be breated than 0");
            }
            return instance;
        }

        public Builder withSide(double side) {
            instance.side = side;
            return this;
        }

        public Builder withColour(Colour colour) {
            instance.colour = colour;
            return this;
        }

        public Builder withCoordinates(double x, double y) {
            instance.x = x;
            instance.y = y;
            return this;
        }
    }
}
