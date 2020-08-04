package sda.szczepanski.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień");
        figures[0] = new Circle.Builder()
                .withRadius(scanner.nextDouble())
                .withColour(Colourable.Colour.RED)
                .withCoordinates(1, 3)
                .build();

        System.out.println("Podaj 2 boki trójkąta prostokatnego");
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
        System.out.println("Podaj bok kwadratu");
        figures[2] = redFigureFactory.createFigure(
                FigureFactory.FigureType.SQUARE,
                scanner.nextDouble());

        System.out.println("Podaj boki prostokąta");
        figures[3] = redFigureFactory.createFigure(
                FigureFactory.FigureType.RECTANGLE,
                scanner.nextDouble(),
                scanner.nextDouble());

        for (Figure figure : figures) {
            System.out.println(figure.prepareDescription());
        }
    }
}
