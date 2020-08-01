package sda.szczepanski.figures;

public interface Figure {
    double calculatePerimeter();
    double calculateArea();

    default String prepareDescription() {
        return this.getType() +
                "\npole " + this.calculateArea() +
                "\nobwód " + this.calculatePerimeter();
    }

    default String getType() {
        return this.getClass().getSimpleName();
    }
}
