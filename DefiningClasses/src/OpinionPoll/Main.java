package OpinionPoll;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            persons.add(person);

        }

        persons.sort(Comparator.comparing(Person::getName));
        persons.stream()
                .filter(person1 -> person1.getAge() > 30)
                .forEach(System.out::println);
    }
}
