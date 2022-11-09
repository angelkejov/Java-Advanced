package groomingSalon;


import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private int capacity;
    List<Pet> data;
    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }


    public void add(Pet name) {
        if (this.data.size() + 1 <= this.capacity) {
            this.data.add(name);
        }
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

    public Pet getPet(String name, String owner) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                return this.data.get(i);
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        System.out.println("The grooming salon has the following clients: ");
        for (Pet e : data) {
            System.out.println(e.getName() + " " + e.getOwner());
        }

        return "";
    }
}
