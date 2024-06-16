package com.winzcode.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType {
    private Show show;
    private SeatType seatType;
    private int price;
}
