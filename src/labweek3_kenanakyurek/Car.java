/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labweek3_kenanakyurek;

/**
 *
 * @author akyur
 */
public class Car {
    
    String plateNumber;
    String model;
    double mileage;
    double fuelLevel;
    double tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }
    
      public void drive(double km) {
        if (km <= 0) {
            System.out.println("Invalid distance!");
            return;
        }

        double requiredFuel = km / 10.0;

        if (requiredFuel > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            mileage += km;
            fuelLevel -= requiredFuel;
            System.out.println("Driving " + km + " km...");
        }
    }

    public void refuel(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid fuel amount!");
            return;
        }

        System.out.println("Refueling " + amount + " liters...");

        if (fuelLevel + amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            fuelLevel += amount;
        }
    }

    public void checkStatus() {
        System.out.println("----- Car Status -----");
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Fuel Level: " + fuelLevel + " liters");

        if (fuelLevel < tankCapacity * 0.10) {
            System.out.println("Low fuel warning!");
        }

        System.out.println("----------------------");
    }
}
