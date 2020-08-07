package sda.szczepanski.figures;

public final class RightTriangle extends AbstractSuperFigure {
    private double base;
    private double height;
    private double hypotenuse;

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
