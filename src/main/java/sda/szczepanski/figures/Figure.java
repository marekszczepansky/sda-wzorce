package sda.szczepanski.figures;

public interface Figure {

    double calculatePerimeter();

    double calculateArea();

    String getType();

    default String prepareDescription() {
        return "\nFigura: " + getType() +
                "\npole: " + calculateArea() +
                "\nobwód: " + calculatePerimeter();
    }
}
