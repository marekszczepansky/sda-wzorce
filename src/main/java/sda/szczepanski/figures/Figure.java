package sda.szczepanski.figures;

public interface Figure {
    double calculatePerimeter();
    double calculateArea();

    default String prepareDescription() {
        return "<<not implemented>>";
    }
}
