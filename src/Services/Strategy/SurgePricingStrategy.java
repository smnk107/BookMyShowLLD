package Services.Strategy;

import Entities.Seat;
import Entities.Show;

import java.util.List;

public class SurgePricingStrategy implements PricingStrategy{
    @Override
    public double calculatePrice(List<Seat> seats, Show show) {
        return seats.size()*200;
    }
}
