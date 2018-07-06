package singleton;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;


public class SingletonTest {

    @Test
    public void testandoSingleton() {

        Singleton s1 = Singleton.getInstance();
        assertTrue(Singleton.class.isInstance(s1));
    }

    @Test
    public void testandoSomething() {

        Singleton s2 = Singleton.getInstance();
        s2.doSomething();
        assertEquals("teste", s2.getSomething());

        Singleton s3 = Singleton.getInstance();
        s2.doSomething();
        assertEquals("teste", s3.getSomething());
    }

}
