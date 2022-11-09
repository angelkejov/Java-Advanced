package christmas;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private String color;
    private int capacity;
    List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }


    public void add(Present present) {
        if (capacity > 0) {
            this.data.add(present);
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).toString().equals(name)) {
                this.data.remove(name);
                return true;
            }
        }
        return false;
    }

    public Present heaviestPresent() {
        double heviest = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getWeight() > heviest) {
                index = i;
            }
        }
        return this.data.get(index);
    }

    public Present getPresent(String name) {
        int index = 0;
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).equals(name)) {
                index = i;
            }
        }

        return this.data.get(index);
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        System.out.println(getColor() + " bag contains: ");
        for (Present datum : data) {
            System.out.println(datum);
        }
        return "";
    }
}
