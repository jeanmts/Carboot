package com.br.concessionaria.carboot.vehicles.repository;

import com.br.concessionaria.carboot.vehicles.models.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicles, Integer> {}
