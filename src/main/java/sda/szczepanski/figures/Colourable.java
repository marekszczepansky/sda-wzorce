package sda.szczepanski.figures;

public interface Colourable {
    enum Colour {
        RED, GREEN, BLUE
    }

    void setColour(Colour colour);
    Colour getColour();
}
