package zad1b;


public class Test {
    public static void main(String[] args) {
        QuickSort sorter = QuickSort.loadFromKeyboard(3);

        var sorted = sorter.sort();

        System.out.print("Wynik: ");

        for (var n : sorted) {
            System.out.printf("%f, ", n);
        }
    }
}
