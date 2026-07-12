package level03.exercise02;

public record Person(String name, int age) {

    private static final int ADULT_AGE = 18;

    public boolean isUnderage(){
        return this.age < ADULT_AGE;
    }
}

