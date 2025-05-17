package com.example.blabla_car.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class Corridas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


@ManyToOne
private Passenger passenger;

    @ManyToOne
    private Driver driver;

    private LocalDate startDate;
    private LocalDate endDate;

    public Corridas() {
    }

    public Corridas(Long id, Passenger passenger, Driver driver, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.driver = driver;
        this.passenger = passenger;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


}
