import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumaTest {
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int numero1 = 1;
        int numero2 = 2;
        Suma instance = new Suma();
        int expResult = 3;
        int result = instance.sumar(numero1, numero2);
        assertEquals(expResult, result);
    }
}
