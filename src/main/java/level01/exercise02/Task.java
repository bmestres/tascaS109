package level01.exercise02;

public class Task {

    Level level;

    public Task(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return this.level;
    }

    public void showLevel(){
        System.out.format("Task level is %s", this.level);
    }
}
