package sda.szczepanski.figures;

public interface Figure {
    double calculatePerimeter();
    double calculateArea();

    default String prepareDescription() {
        return this.getClass().getSimpleName() +
                "\npole " + this.calculateArea() +
                "\nobwód " + this.calculatePerimeter();
    }
}
