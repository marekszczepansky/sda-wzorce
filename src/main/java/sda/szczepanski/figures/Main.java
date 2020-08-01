package sda.szczepanski.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień");
        figures[0] = new Circle(scanner.nextDouble());

        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            System.out.println("pole " + figure.getArea());
            System.out.println("obwód " + figure.getCircumference());
        }
    }
}
