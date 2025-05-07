import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Trade> trades = new ArrayList<>();
        trades.add(new Trade("AAPL", LocalTime.of(9, 30), 150.5));
        trades.add(new Trade("GOOG", LocalTime.of(10, 30), 1002.3));
        trades.add(new Trade("AAPL", LocalTime.of(16, 0), 152.1));
        trades.add(new Trade("GOOG", LocalTime.of(17, 0), 1005.0));
        trades.add(new Trade("AAPL", LocalTime.of(12, 0), 100.0));

        System.out.println("Market Open and Close Prices:");
        Utils.printMarketOpenClosePrices(trades.iterator());
    }
}
