package sda.szczepanski.figures;

public abstract class AbstractSuperFigure implements SuperFigure {
    protected Colour colour;
    protected double x;
    protected double y;

    @Override
    public String prepareDescription() {
        return SuperFigure.super.prepareDescription() +
                "\nkolor " + this.getColour() +
                String.format("\npozycja (%f, %f)",
                        this.getX(),
                        this.getY()
                );
    }

    @Override
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return this.colour;
    }

    @Override
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
