import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //EXERCISE 1
        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade("AAPL", LocalTime.of(9, 30), 150.5));
        trades.add(new Trade("GOOG", LocalTime.of(10, 30), 1002.3));
        trades.add(new Trade("AAPL", LocalTime.of(16, 0), 152.1));
        trades.add(new Trade("GOOG", LocalTime.of(17, 0), 1005.0));
        trades.add(new Trade("AAPL", LocalTime.of(12, 0), 100.0));

        System.out.println("Market Open and Close Prices:");
        Utils.printMarketOpenClosePrices(trades.iterator());

        System.out.println("\n");
        System.out.println("\n");

        //EXERCISE 2
        MinMaxStack stack = new MinMaxStack();
        stack.insert(10);
        stack.insert(12);
        stack.insert(13);
        stack.insert(20);
        stack.insert(50);

        System.out.println("Minimum: " + stack.getMin());
        System.out.println("Maximum: " + stack.getMax());

        System.out.println("Extract Max: " + stack.extractMax());
        System.out.println("Maximum after extraction: " + stack.getMax());
        System.out.println("\n");
        System.out.println("\n");

        //EXERCISE 3

        DuplicateCheck dc = new DuplicateCheck();
        int[] arr = {3, 5, 7, 2, 1};
        System.out.println(dc.containsDuplicates(arr));
        System.out.println("\n");
        int[] arr2 = {3, 5, 7, 2, 1, 2, 6, 9};
        System.out.println(dc.containsDuplicates(arr2));



    }
}
