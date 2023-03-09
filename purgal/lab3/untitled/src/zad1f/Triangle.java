package zad1f;

import zad1b.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle {
    double ax, ay, bx, by, cx, cy;
    double a, b, c;

    double area;

    private Triangle(double a, double b, double c, double ax, double ay, double bx, double by, double cx, double cy) {
        this.a = a;
        this.b = b;
        this.c = c;

        this.ax = ax;
        this.ay = ay;

        this.bx = bx;
        this.by = by;

        this.cx = cx;
        this.cy = cy;

        this.area = area(a, b, c);
    }

    private static double segmentLength(double ax, double ay, double bx, double by) {
        return Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
    }

    public static Triangle loadFromKeyboard() {
        List<Double> points = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Punkty (ax, ay, bx, by, cx, cy): ");
            String line = scanner.nextLine();

            Scanner doubleScanner = new Scanner(line);
            points.clear();

            while (doubleScanner.hasNextDouble()) {
                points.add(doubleScanner.nextDouble());
            }
        } while (points.size() != 6);

        var c = Triangle.segmentLength(points.get(0), points.get(1), points.get(2), points.get(3));
        var a = Triangle.segmentLength(points.get(2), points.get(3), points.get(4), points.get(5));
        var b = Triangle.segmentLength(points.get(4), points.get(5), points.get(0), points.get(1));

        var sorter = new QuickSort(new double[] { a, b, c });
        var data = sorter.sort();

        if (data[0] + data[1] <= data[2]) {
            return null;
        }

        return new Triangle(a, b, c, points.get(0), points.get(1), points.get(2), points.get(3), points.get(4), points.get(5));
    }

    double area(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean isPointInside(double x, double y) {
        double ap = Triangle.segmentLength(ax, ay, x, y);
        double bp = Triangle.segmentLength(bx, by, x, y);
        double cp = Triangle.segmentLength(cx, cy, x, y);

        double area1 = area(cp, b, ap);
        double area2 = area(a, cp, bp);
        double area3 = area(bp, ap, c);

        System.out.printf("area1: %f, area2: %f, area3: %f === area: %f", area1, area2, area3, area);

        return  area1 + area2 + area3 == area;
    }
}
