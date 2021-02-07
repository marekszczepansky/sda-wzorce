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
        //TODO: create circle

        printStream.println("Podaj 2 boki trójkąta prostokatnego");
        final double base = scanner.nextDouble();
        final double height = scanner.nextDouble();
        //TODO: create triangle

        printStream.println("Podaj bok kwadratu");
        final double side = scanner.nextDouble();
        //TODO: create square

        printStream.println("Podaj boki prostokąta");
        final double sideA = scanner.nextDouble();
        final double sideB = scanner.nextDouble();
        //TODO: create rectangle

        for (Figure figure : figures) {
            //TODO: prepare output
            if (nonNull(figure)) {
                printStream.println(figure.prepareDescription());
            } else {
                printStream.println("figure is empty");
            }
        }
    }
}
