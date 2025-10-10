package Services.Strategy;

import Entities.Seat;
import Entities.Show;

import java.util.List;

public interface PricingStrategy {

    public double calculatePrice(List<Seat> seats, Show show);
}
