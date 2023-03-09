package zad1a;

import java.util.Scanner;

public class Quadratic {
    private final float a;
    private final float b;
    private final float c;

    public Quadratic(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    };

    public static Quadratic loadFromKeyboard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        float a = scanner.nextFloat();

        System.out.print("b: ");
        float b = scanner.nextFloat();

        System.out.print("c: ");
        float c = scanner.nextFloat();

        return new Quadratic(a, b, c);
    }

    private float delta() {
        return b*b - 4.0f * a * c;
    }

    public float[] calc() {
        if (delta() < 0) {
            return new float[]{};
        }

        if (delta() == 0.0) {
            return new float[]{-b/2.0f*a};
        }

        float x1 = (-1.0f * b - (float)Math.sqrt(delta())) / 2.0f*a;
        float x2 = (-1.0f * b + (float)Math.sqrt(delta())) / 2.0f*a;

        return new float[]{ x1, x2 };
    }

}
