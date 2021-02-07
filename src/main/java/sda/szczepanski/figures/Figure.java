package sda.szczepanski.figures;

public interface Figure {
    double calculatePerimeter();

    double calculateArea();

    // TODO: prepare implementation
    default String prepareDescription() {
        this.getClass().getSimpleName();
        return "Figura: ****\npole: ****\nobwód: ****";
    }
}
