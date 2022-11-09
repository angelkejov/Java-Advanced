package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private int capacity;
    List<Person> data;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Person person) {
        if (this.data.size() + 1 <= this.capacity) {
            this.data.add(person);
        }
    }

    public int getCount() {
        return this.data.size();
    }

    public boolean remove(String name) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                this.data.remove(this.data.get(i));
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                return this.data.get(i);
            }
        }
        return null;
    }

    public String getStatistics() {
        System.out.println("The people in the hotel " + this.name + " are");
        for (Person e : data) {
            System.out.println(e);
        }

        return "";
    }
}
