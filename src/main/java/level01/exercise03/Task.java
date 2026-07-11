package level01.exercise03;


public class Task {

    Level level;

    public Task(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return this.level;
    }
    public void showLevel(){
        System.out.format("Task level is %s\n", this.level);
    }

    public void showLevelColor(){
        System.out.format("Level color is %s\n", this.level.getColor());
    }
}
