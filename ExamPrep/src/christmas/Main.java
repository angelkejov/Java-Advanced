package christmas;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag("Black", 10);

        Present present = new Present("Doll", 0.4, "girl");
        System.out.println(present);
        bag.add(present);

        System.out.println(bag.remove("Toy"));
        Present secondPresent = new Present("Train", 2, "boy");
        bag.add(secondPresent);

        Present heaviestPresent = bag.heaviestPresent();
        System.out.println(heaviestPresent);
        Present p = bag.getPresent("Doll");

        System.out.println(p);
        System.out.println(bag.count());

        System.out.println(bag.report());
    }
}
