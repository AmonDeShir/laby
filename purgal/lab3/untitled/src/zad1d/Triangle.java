package zad1d;

import zad1b.QuickSort;

public class Triangle {
    double a, b, c;

    private Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle loadFromKeyboard() {
        var sorter = QuickSort.loadFromKeyboard(3);
        var data = sorter.sort();

        if (data[0] + data[1] <= data[2]) {
            return null;
        }

        return new Triangle(data[0], data[1], data[2]);
    }

    public String typeBySide() {
        if (a == b && a == c) {
            return "równoboczny";
        }

        if (a == b) {
            return "równoramienny";
        }

        return "różnoboczny";
    }

    public String typeByAngle() {
        if (a*a + b*b == c*c) {
            return "prostokątny";
        }

        if (a*a + b*b < c*c) {
            return "ostrokątny";
        }

        return "rozwartokątny";
    }
}
