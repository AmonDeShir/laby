package zad1c;


import zad1b.QuickSort;

public class Test {
    public static void main(String[] args) {
        QuickSort sorter = QuickSort.loadFromKeyboard(5);

        var sorted = sorter.sort();

        System.out.print("Wynik: ");

        for (var n : sorted) {
            System.out.printf("%f, ", n);
        }
    }
}
