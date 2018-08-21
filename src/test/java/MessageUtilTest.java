import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageUtilTest {

    String message = "Rolando";
    MessageUtil messageUtil = new MessageUtil(message);

    @Ignore
    @Test
    public void printMessage() {
        System.out.println("This is printing inside a test of printMessage method.");
        message = "Rolando";
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void salutationMessage() {
        System.out.println("This is printing inside a test of salutationMessage method.");
        message = "Hello!" + "Rolando";
        assertEquals(message, messageUtil.salutationMessage());
    }
}