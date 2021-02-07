package sda.szczepanski.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień");
        final double radius = scanner.nextDouble();
        //TODO: create circle

        System.out.println("Podaj 2 boki trójkąta prostokatnego");
        final double base = scanner.nextDouble();
        final double height = scanner.nextDouble();
        //TODO: create triangle

        System.out.println("Podaj bok kwadratu");
        final double side = scanner.nextDouble();
        //TODO: create square

        System.out.println("Podaj boki prostokąta");
        final double sideA = scanner.nextDouble();
        final double sideB = scanner.nextDouble();
        //TODO: create rectangle

        for (Figure figure : figures) {
            //TODO: prepare output
            System.out.println("wynik...");
        }
    }
}
