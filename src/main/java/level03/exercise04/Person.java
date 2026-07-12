package level03.exercise04;

public record Person(String name, int age) {

    private static final int ADULT_AGE = 18;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isUnderage(){
        return this.age < ADULT_AGE;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", this.name, this.age);
    }
}

