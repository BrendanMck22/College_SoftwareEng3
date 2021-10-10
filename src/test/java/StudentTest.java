import junit.framework.TestCase;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentTest extends TestCase {
    ArrayList<String> courses = new ArrayList<String>(); // fix later


    // Student testStudent = new Student("Brendan", 22, LocalDate.of(1999,01,02),11111);
    @Test
    public void testGetUsername() {
        Student testStudent = new Student("Brendan", 22, LocalDate.of(1999,01,02),11);
        String testUsername= testStudent.getUsername();
        assertEquals("Brendan11",testUsername);
    }

}