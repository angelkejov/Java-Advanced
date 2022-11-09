package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Car car = new Car();

        //if fields are public;
//        car.brand = "Toyta";
//        car.model = "Supra";
//        car.horsePower = 1000;

        //if fields are private we make constructor with all fields in;
        /* field 1, field 2, field 3*/
//        Car car1 = new Car("Toyta", "Supra", 1000);

        // Also we can set values by getters and setters;
        //Geters for printing
        //Setters for set values


        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");

            String brand = tokens[0];
            String model = tokens[1];
            int hp = Integer.parseInt(tokens[2]);

            Car car = new Car(brand, model, hp);
            System.out.println(car);
        }
    }
}
