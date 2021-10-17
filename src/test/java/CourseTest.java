import junit.framework.TestCase;
import org.joda.time.DateTime;
import org.testng.annotations.Test;
public class CourseTest extends TestCase {
    DateTime startTime = new DateTime(2021, 1, 1, 2, 30);
    DateTime endTime =  new DateTime(2021, 12, 31, 2, 30);
    Course IntroToEE = new Course("IntroToEE",startTime, endTime);


@Test
public void testCourseName(){
    String courseName = IntroToEE.getCourseName();
    assertEquals("IntroToEE", courseName);
    }
}
