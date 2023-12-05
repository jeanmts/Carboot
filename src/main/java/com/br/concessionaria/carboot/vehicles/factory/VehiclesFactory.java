package com.br.concessionaria.carboot.vehicles.factory;

import com.br.concessionaria.carboot.vehicles.models.Car;
import com.br.concessionaria.carboot.vehicles.models.MotorCycle;

public class VehiclesFactory {
    public static IVehicles getInstace(String type) {
        switch (type) {
            case "car": return new Car();
            case "motorcycle": return new MotorCycle();
            default:  throw new IllegalArgumentException("Tipo de veiculo não encontrado");
        }
    }
}
