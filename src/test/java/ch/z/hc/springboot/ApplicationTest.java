package ch.z.hc.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTest {

    @Test
    void contextLoads() {
        int expected = 1;
        int actual = 1;

        assertEquals(expected, actual);
    }

}
