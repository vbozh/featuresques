import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AttributionTest {

    @BeforeEach
    public void waitASecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    public void test() {
        assertTrue(true);
    }
}