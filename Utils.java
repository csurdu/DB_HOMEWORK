import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Utils {

    public static void printMarketOpenClosePrices(Iterator<Trade> trades) {

        Map<String, Double[]> prices = new HashMap<>();
        while (trades.hasNext()) {
            Trade trade = trades.next();
            prices.putIfAbsent(trade.ticker, new Double[]{trade.price, trade.price});
            prices.get(trade.ticker)[1] = trade.price;
        }
        for (String ticker : prices.keySet()) {
            Double[] pricePair = prices.get(ticker);
            System.out.println("Ticker: " + ticker + " Open: " + pricePair[0] + " Close: " + pricePair[1]);
        }

    }
}
