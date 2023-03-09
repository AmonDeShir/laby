package zad1f;


import zad1b.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = Triangle.loadFromKeyboard();

        if (triangle == null) {
            System.out.println("Z podanych danych, nie da się zbudować trójkąta");
            return;
        }

        List<Double> point = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Punkt (x, y): ");
            String line = scanner.nextLine();

            Scanner doubleScanner = new Scanner(line);
            point.clear();

            while (doubleScanner.hasNextDouble()) {
                point.add(doubleScanner.nextDouble());
            }
        } while (point.size() != 2);

        if (triangle.isPointInside(point.get(0), point.get(1))) {
            System.out.println("Punkt znajduje się w trójkącie");
        }
        else {
            System.out.println("Punkt znajduje się poza trójkątem");
        }
    }
}
