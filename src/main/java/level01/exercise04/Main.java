package level01.exercise04;

public class Main {
    public static void main(String[] args) {

        Level level01 = StringToEnum.convertStringToEnum("LOW");
        Task task01 = new Task(level01);

        task01.showLevel();
        task01.showLevelColor();


    }
}
