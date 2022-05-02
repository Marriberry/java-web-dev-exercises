package Technology;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
    @Test
    public void computerStorageTestOne(){
        Computer apple = new Computer(2, 2, true);
        assertEquals(2, apple.getStorage(), .001);
    }


    @Test
    public void laptopStorageTestOne() {
        Laptop dell = new Laptop(2, 2, true, 10);
        assertEquals(2, dell.getStorage(), .001);
    }

    @Test
    public void smartPhoneStorageTestOne() {
        SmartPhone android = new SmartPhone(64, 9, false, 10);
        assertEquals(64, android.getStorage(), .001);
    }
}
