package com.winzcode.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseClass{
    private int rowNo;
    private int colNo;
    private String Number;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
}
