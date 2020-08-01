package sda.szczepanski.figures;

public class RightTriangle implements Figure {
    private double base;
    private double height;
    private double hypotenuse;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(this.base * this.base + this.height * this.height);
    }

    @Override
    public double getCircumference() {
        return base + height + hypotenuse;
    }

    @Override
    public double getArea() {
        return base * height / 2.0;
    }
}
