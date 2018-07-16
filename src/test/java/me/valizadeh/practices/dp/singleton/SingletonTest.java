package me.valizadeh.practices.dp.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author valizadeh
 * @implNote
 * Tests which runs on {@link Ronaldinho}
 * @see Ronaldinho
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class SingletonTest {

    /**
     * Tests if it gets an instance of {@link Ronaldinho}
     */
    @Test
    public void isNotNull() {
        Ronaldinho instance = Ronaldinho.oneAndOnly();
        assertNotNull(instance);
    }

    /**
     * Tests if it gets two instances of {@link Ronaldinho}, they are the same or there could exist a replica.
     */
    @Test
    public void isEqual() {
        Ronaldinho instance1 = Ronaldinho.oneAndOnly();
        Ronaldinho instance2 = Ronaldinho.oneAndOnly();

        assertEquals(instance1, instance2);
    }
}
