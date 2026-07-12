package level03.exercise03;

public record Person(String name, int age) {

    private static final int ADULT_AGE = 18;

    public Person {
        if (age < ADULT_AGE) {
            throw new IllegalArgumentException("Age cannot be less than 18");
        }
    }
}

