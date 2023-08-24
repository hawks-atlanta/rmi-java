package capyfile.rmi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
    @Test void someCreationTest() {
        Message msg = new Message("Hello there");
        
        assertTrue(msg.content == "Hello there", "Content should be set");
    }
}
