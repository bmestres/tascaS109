package level03.exercise04;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Isaac", 17),
                new Person("Linda", 67),
                new Person("Max", 29),
                new Person("Juliana", 4),
                new Person("Patrick", 13)
        );

        List<Person> adults = PeopleManager.removeUnderage(people);
        PeopleManager.showPeople(adults);
    }
}
