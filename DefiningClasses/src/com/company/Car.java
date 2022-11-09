package com.company;

public class Car {

     String brand;
     String model;
     int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
          return brand;
     }

     public String getModel() {
          return model;
     }

     public int getHorsePower() {
          return horsePower;
     }

     public void setBrand(String brand) {
          this.brand = brand;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public void setHorsePower(int horsePower) {
          this.horsePower = horsePower;
     }

     @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", getBrand(),
                getModel(), getHorsePower());
     }
}
