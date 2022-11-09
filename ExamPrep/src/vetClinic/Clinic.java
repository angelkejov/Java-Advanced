//package vetClinic;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Clinic {
//
//     int capacity;
//     List<Pet> data;
//
//    public Clinic(int capacity) {
//        this.capacity = capacity;
//        data = new ArrayList<>();
//    }
//
//    public void add(Pet dog) {
//        if (data.size() + 1 <= this.capacity) {
//            this.data.add(dog);
//        }
//    }
//
//    public boolean remove(String name) {
//        for (int i = 0; i < this.data.size();i++) {
//            if (this.data.get(i).getName().equals(name)) {
//                this.data.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    public Pet getPet(String name, String owner) {
//        for (int i = 0; i < this.data.size(); i++) {
//            if (this.data.get(i).getName().equals(name) && this.data.get(i).getOwner().equals(owner)) {
//                return data.get(i);
//            }
//        }
//        return null;
//    }
//
//
//    public Pet getOldestPet() {
//
//        int oldest = Integer.MIN_VALUE;
//        int index = 0;
//        for (int i = 0; i < this.data.size(); i++) {
//            if (this.data.get(i).getAge() > oldest) {
//                index = i;
//            }
//        }
//
//        return this.data.get(index);
//    }
//
//    public int getCount() {
//        return this.data.size();
//    }
//
//    public String getStatistics() {
//
//        System.out.println("The clinic has the following patients: ");
//        for (Pet datum : data) {
//            System.out.println(datum.getName() + " " + datum.getOwner());
//        }
//        return null;
//    }
//}
