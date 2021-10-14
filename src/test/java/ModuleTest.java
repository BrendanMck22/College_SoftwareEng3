import junit.framework.TestCase;
import org.testng.annotations.Test;
public class ModuleTest extends TestCase {
    Module EE123    = new Module("IntroToEE", 12345);

    @Test
    public void testModName() {
        String modname = EE123.getModName();
        assertEquals("IntroToEE", modname);
    }

}
