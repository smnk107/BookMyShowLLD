package Services;

import Entities.Seat;

import java.util.List;

public class SeatCheckAndMark {

    boolean validate(List<Seat> seats)
    {
        for(Seat s : seats) if(s.isBooked) return false;

        return true;
    }

    void bookSeats(List<Seat> seats)
    {
        for(Seat s : seats) if(s.isBooked) s.isBooked = true;
    }
}
