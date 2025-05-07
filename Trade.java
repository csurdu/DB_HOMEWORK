import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;


@Data
@Getter
@Setter

public class Trade {

    final String ticker;
    final LocalTime time;
    final double price;


    public Trade(String ticker, LocalTime time, double price) {
        this.ticker = ticker;
        this.time = time;
        this.price = price;
    }
}
