package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private int capacity;
    List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }


    public void add(Person person) {
        if (this.roster.size() + 1 <= this.capacity) {
            this.roster.add(person);
        }
    }

    public int getCount() {
        return this.roster.size();
    }

    public boolean remove(String name) {
        for (int i = 0; i < this.roster.size(); i++) {
            if (this.roster.get(i).getName().equals(name)) {
                this.roster.remove(this.roster.get(i));
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        for (int i = 0; i < this.roster.size(); i++) {
            if (this.roster.get(i).getName().equals(name)) {
                return this.roster.get(i);
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();
        out.append(String.format("The people in the hotel %s are:%n", this.name));
        for (Person person : roster) {
            out.append(String.format("%s%n", person));
        }
        return out.toString().trim();
    }
}
