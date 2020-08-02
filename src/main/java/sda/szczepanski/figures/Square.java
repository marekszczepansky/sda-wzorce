package sda.szczepanski.figures;

public final class Square extends AbstractSuperFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    private Square() {
    }

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

        Square build() {
            if (instance.side <= 0) {
                throw new IllegalStateException("Square side must be breated than 0");
            }
            return instance;
        }

        Builder withSide(double side) {
            instance.side = side;
            return this;
        }

        Builder withColour(Colour colour) {
            instance.colour = colour;
            return this;
        }

        Builder withCoordinates(double x, double y) {
            instance.setCoordinates(x, y);
            return this;
        }
    }
}
