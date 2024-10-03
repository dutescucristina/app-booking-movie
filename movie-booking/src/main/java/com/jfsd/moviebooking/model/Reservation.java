package com.jfsd.moviebooking.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.ZonedDateTime;


@Data
@Entity
@Table(name = "reservations")
public class Reservation implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator", allocationSize = 1)
    private Long id;

    @Column(name = "email_address", length = 45, nullable = false)
    private String email;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Cinema cinema;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "reservation_date")
    private ZonedDateTime reservationDate;

    @CreatedDate
    @Column(name = "created_date")
    private ZonedDateTime createdDate;


}
