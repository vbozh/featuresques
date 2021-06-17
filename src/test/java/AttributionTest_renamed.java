package packageMove;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AttributionTest_renamed {

    @BeforeEach
    public void waitASecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    public void test() {
        assertTrue(false);
    }

    //todo

    public String change(String added_lines) {
        return added_lines;
    }
}