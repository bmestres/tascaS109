package level03.exercise04;

import java.util.List;
import java.util.stream.Collectors;

public class PeopleManager {

    public static List<Person> removeUnderage(List<Person> unfilteredPeople){
        return unfilteredPeople.stream().filter(person -> {return !person.isUnderage();}).collect(Collectors.toList());
    }

    public static void showPeople(List<Person> people){
        people.stream().forEach(person -> System.out.println(person.toString()));
    }
}
