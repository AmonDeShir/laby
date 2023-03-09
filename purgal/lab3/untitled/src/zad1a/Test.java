package zad1a;


public class Test {
    public static void main(String[] args) {
        Quadratic quadratic = Quadratic.loadFromKeyboard();

        float[] result = quadratic.calc();

        if (result.length == 0) {
            System.out.println("Brak miejsc zerowych w zbiorze liczb rzeczywistych");
            return;
        }

        if (result.length == 1) {
            System.out.printf("X1 = X2 = %f \n", result[0]);
            return;
        }

        System.out.printf("X1 = %f, X2 = %f \n", result[0], result[1]);
    }
}
