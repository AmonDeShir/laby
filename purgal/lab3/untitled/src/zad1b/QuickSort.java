package zad1b;

import java.util.*;
import java.util.stream.DoubleStream;

public class QuickSort {
    private List<Double> numbers = new ArrayList<>();

    public QuickSort(double[] numbers) {
        this.numbers.addAll(DoubleStream.of(numbers).boxed().toList());
    };

    public static QuickSort loadFromKeyboard(int size) {
        QuickSort data;

        do {
            System.out.printf("Podaj %d liczby\n", size);
            data = QuickSort.loadFromKeyboard();

        } while (data.numbers.size() != size);

        return data;
    }

    public static QuickSort loadFromKeyboard() {
        QuickSort data = new QuickSort(new double[] {});

        Scanner scanner = new Scanner(System.in);

        System.out.print("Liczby (double): ");
        String line = scanner.nextLine();

        Scanner doubleScanner = new Scanner(line);

        while (doubleScanner.hasNextDouble()) {
            data.numbers.add(doubleScanner.nextDouble());
        }

        return data;
    }

    List<Double> sort(List<Double> data) {
        data = new LinkedList<>(data);

        if (data.size() > 1) {
            double pivot = data.remove(data.size() / 2);

            List<Double> lesser = data.stream().filter(i -> i <= pivot).toList();
            List<Double> greater = data.stream().filter(i -> i > pivot).toList();

            var result = new ArrayList<Double>(sort(lesser));
            result.add(pivot);
            result.addAll(sort(greater));

            return result;
        }

        return data;
    }

    public double[] sort() {
        return this.sort(this.numbers).stream().mapToDouble(i -> i).toArray();
    }
}
