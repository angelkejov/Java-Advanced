//package cafe;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Cafe {
//
//    private String name;
//    private int capacity;
//    List<Employee> employees;
//
//    public Cafe(String name, int capacity) {
//        this.name = name;
//        this.capacity = capacity;
//        this.employees = new ArrayList<>();
//    }
//
//
//    public void addEmployee(Employee employee) {
//        if (employees.size() + 1 <= this.capacity) {
//            this.employees.add(employee);
//        }
//    }
//
//
//    public boolean removeEmployee(String employee) {
//        for (int i = 0; i < this.employees.size(); i++) {
//            if (this.employees.get(i).getName().equals(employee)) {
//                this.employees.remove(this.employees.get(i));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public Employee getOldestEmployee() {
//        int oldest = Integer.MIN_VALUE;
//        for (int i = 0; i < this.employees.size(); i++) {
//            if (this.employees.get(i).getAge() > oldest) {
//                return this.employees.get(i);
//            }
//        }
//        return null;
//    }
//
//    public Employee getEmployee(String name) {
//        for (int i = 0; i < this.employees.size(); i++) {
//            if (this.employees.get(i).getName().equals(name)) {
//                return this.employees.get(i);
//            }
//        }
//
//        return null;
//    }
//
//    public int getCount() {
//        return this.employees.size();
//    }
//
//    public String report() {
//        System.out.println("Employees working at Cafe: ");
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
//
//        return "";
//    }
//}
