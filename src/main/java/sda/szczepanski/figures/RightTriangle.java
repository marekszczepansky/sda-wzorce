package sda.szczepanski.figures;

import static java.lang.Math.sqrt;

public class RightTriangle implements Figure{
    public static final String TYPE_NAME = "Trójkąt prostokątny";
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
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
}
