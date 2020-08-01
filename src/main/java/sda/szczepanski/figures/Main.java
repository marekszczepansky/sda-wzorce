package sda.szczepanski.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień");
        figures[0] = new Circle(scanner.nextDouble());

        System.out.println("Podaj 2 boki trójkąta prostokatnego");
        figures[1] = new RightTriangle(scanner.nextDouble(), scanner.nextDouble());

        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            System.out.println("pole " + figure.calculateArea());
            System.out.println("obwód " + figure.calculatePerimeter());
        }
    }
}
