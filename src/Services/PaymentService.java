package Services;

import Entities.Booking;

public class PaymentService {

    public void makePayment(Booking booking)
    {
         System.out.println("Process payment of amount"+booking.price);

    }
}
