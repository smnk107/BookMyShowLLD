package Services;

import Entities.Booking;
import Entities.Seat;
import Entities.Show;
import Entities.User;
import Services.Strategy.PricingStrategy;

import java.util.List;

public class BookingService {

    PricingStrategy pricingStrategy;
    PaymentService paymentService ;
    SeatCheckAndMark seatCheckAndMark;

    BookingService(PricingStrategy pricingStrategy)
    {
        this.pricingStrategy = pricingStrategy;
        paymentService = new PaymentService();
        seatCheckAndMark = new SeatCheckAndMark();
    }

    public Booking createBooking(Show show, User user, List<Seat> seats)
    {

        if(seatCheckAndMark.validate(seats)){
            System.out.println("All selected seats are not available");
            return null;
        }

        Booking booking = new Booking();
        double price = pricingStrategy.calculatePrice(seats,show);
        booking.price = price;
        paymentService.makePayment(booking);

        seatCheckAndMark.bookSeats(seats);
        booking.seats = seats;

        //implement price
        return booking;
    }
}
