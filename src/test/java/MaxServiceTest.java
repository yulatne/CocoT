import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void FindMax() {
        MaxService service = new MaxService();

        int a = 6;
        int b = 4;

        int expected = 6;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);

    }
}

