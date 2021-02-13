package sda.szczepanski.figures;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

import static java.util.Objects.nonNull;

public class Main {
    public static void main(String[] args) {
        task1(new Scanner(System.in), System.out);
    }

    public static void task1(Scanner scanner, PrintStream printStream) {
        Figure[] figures = new Figure[4];

        printStream.println("Podaj promień");
        final double radius = scanner.nextDouble();
        figures[0] = new Circle(radius);

        printStream.println("Podaj 2 boki trójkąta prostokatnego");
        final double base = scanner.nextDouble();
        final double height = scanner.nextDouble();
        figures[1] = new RightTriangle(base, height);

        printStream.println("Podaj bok kwadratu");
        final double side = scanner.nextDouble();
        figures[2] = new Square(side);

        printStream.println("Podaj boki prostokąta");
        final double sideA = scanner.nextDouble();
        final double sideB = scanner.nextDouble();
        figures[3] = new Rectangle.Builder()
                .withSideA(sideA)
                .withSideB(sideB)
                .build();

        for (Figure figure : figures) {
            if (nonNull(figure)) {
                printStream.println(figure.prepareDescription());
            } else {
                printStream.println("figure is empty");
            }
        }
    }
}
