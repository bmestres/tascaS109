package Level03;

import level03.exercise04.PeopleManager;
import level03.exercise04.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class removeUnderageTest {
    @Test
    void resultingListMustMatchExpected(){
        List<Person> people = List.of(
                new Person("Isaac", 17),
                new Person("Linda", 67),
                new Person("Max", 29),
                new Person("Juliana", 4),
                new Person("Patrick", 13)
        );

        List<Person> expectedPeople = List.of(
                new Person("Linda", 67),
                new Person("Max", 29)
        );

        List<Person> adults = PeopleManager.removeUnderage(people);
        assertThat(adults).isEqualTo(expectedPeople);
    }
}
