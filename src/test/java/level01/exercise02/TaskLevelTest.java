package level01.exercise02;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TaskLevelTest {

    @Test
    void taskLevelsMustMatch(){
        Task task01 = new Task(Level.LOW);
        assertThat(task01.getLevel()).isEqualTo(Level.LOW);

        Task task02 = new Task(Level.MEDIUM);
        assertThat(task02.getLevel()).isEqualTo(Level.MEDIUM);

        Task task03 = new Task(Level.HIGH);
        assertThat(task03.getLevel()).isEqualTo(Level.HIGH);
    }
}
