package level01.exercise03;

public enum Level {
    LOW("Green"),
    MEDIUM("Yellow"),
    HIGH("Red");

    private final String color;

    Level(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

}
