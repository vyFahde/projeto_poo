package com.example.blabla_car.model;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String cnh;

    @Column(nullable = false, unique = true)


    @OneToMany
    private Set<Corridas> corridas;


}
