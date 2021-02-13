package sda.szczepanski.figures;

public interface Colourable {
    enum Colour {
        REG, GREEN, BLUE
    }

    void setColour(Colour colour);
    Colour getColour();
}
