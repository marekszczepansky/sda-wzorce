package sda.szczepanski.figures;

public class Rectangle implements Figure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double SideB) {
        this.sideA = sideA;
        this.sideB = SideB;
    }

    @Override
    public double calculatePerimeter() {
        return sideA * sideB;
    }

    @Override
    public double calculateArea() {
        return 2 * (sideA + sideB);
    }
}
