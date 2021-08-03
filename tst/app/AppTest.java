package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @BeforeEach
    void setup() {
    }

    @Test
    void test_getThree() {
        assertEquals(3, App.getThree());
    }
}
