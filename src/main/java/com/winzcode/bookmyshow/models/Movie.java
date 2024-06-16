package com.winzcode.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Date;

@Getter
@Setter
@Entity
public class Movie extends BaseClass {

    private String name;
    private Date releaseDate;
    private float runningTime;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;
}
