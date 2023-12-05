package com.br.concessionaria.carboot.vehicles.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Vehicles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Integer id;

    @Column
    @Getter
    @Setter
    @NotBlank
    private String name;

    @Column
    @Getter
    @Setter
    @NotBlank
    private String type;

    @Column
    @Getter
    @Setter
    @NotBlank
    private String color;

    @Column
    @Getter
    @Setter
    @NotBlank
    private String model;

    @Column
    @Getter
    @Setter
    @Min(1000)
    private Integer year;

}
