package level03;

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
}

