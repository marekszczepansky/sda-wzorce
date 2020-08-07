package sda.szczepanski.figures;

public final class Rectangle extends AbstractSuperFigure {
    private double sideA;
    private double sideB;

    private Rectangle(Builder builder) {
        this.sideA = builder.sideA;
        this.sideB = builder.sideB;
        this.colour = builder.colour;
        this.x = builder.x;
        this.y = builder.y;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    public static class Builder {

        private double sideA;
        private double sideB;
        private Colour colour;
        private double x;
        private double y;

        public Rectangle build() {
            if (sideA <= 0 || sideB <= 0) {
                throw new IllegalStateException("SideA and sideB must be greater than 0");
            }
            return new Rectangle(this);
        }

        public Builder withSideA(double sideA) {
            this.sideA = sideA;
            return this;
        }

        public Builder withSideB(double sideB) {
            this.sideB = sideB;
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
