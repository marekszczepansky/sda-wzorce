package sda.szczepanski.figures;

public interface Figure {

    double calculatePerimeter();

    double calculateArea();

    String getType();

    // TODO: prepare implementation
    default String prepareDescription() {
        return "\nFigura: " + getType() +
                "\npole: " + calculateArea() +
                "\nobwód: " + calculatePerimeter();
    }
}
