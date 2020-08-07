package sda.szczepanski.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        final Logger logger = Logger.getInstance();

        Scanner scanner = new Scanner(System.in);
        logger.writeLine("Podaj promień");
        figures[0] = new Circle.Builder()
                .withRadius(scanner.nextDouble())
                .withColour(Colourable.Colour.RED)
                .withCoordinates(1, 3)
                .build();

        logger.writeLine("Podaj 2 boki trójkąta prostokatnego");
        figures[1] = new RightTriangle.Builder()
                .withBase(scanner.nextDouble())
                .withHeight(scanner.nextDouble())
                .withColour(Colourable.Colour.GREEN)
                .withCoordinates(-3, -6)
                .build();

        FigureFactory redFigureFactory = new FigureFactory(
                Colourable.Colour.RED,
                1.0,
                2.0);
        logger.writeLine("Podaj bok kwadratu");
        figures[2] = redFigureFactory.createFigure(
                FigureFactory.FigureType.SQUARE,
                scanner.nextDouble());

        logger.writeLine("Podaj boki prostokąta");
        figures[3] = redFigureFactory.createFigure(
                FigureFactory.FigureType.RECTANGLE,
                scanner.nextDouble(),
                scanner.nextDouble());

        for (Figure figure : figures) {
            logger.writeLine(figure.prepareDescription());
        }
    }
}
