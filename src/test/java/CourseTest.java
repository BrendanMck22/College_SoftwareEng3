import junit.framework.TestCase;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class CourseTest extends TestCase {
    DateTime startTime = new DateTime(2021, 1, 1, 2, 30);
    DateTime endTime =  new DateTime(2021, 12, 31, 2, 30);
    Course IntroToEE = new Course("IntroToEE",startTime, endTime);
    Student testStudent1 = new Student("Brendan", 22, LocalDate.of(1999,01,02),13);
    Student testStudent2 = new Student("Adam", 21, LocalDate.of(2000,01,02),155);
    Module EE123    = new Module("EE123", 12345);
    Module EC234 = new Module("EC234", 1976);

@Test
public void testCourseName(){
    String courseName = IntroToEE.getCourseName();
    assertEquals("IntroToEE", courseName);
    }
    @Test
    public void testAddCourseToModule() {
        IntroToEE.addCourseToModule(EE123);
        IntroToEE.addCourseToModule(EC234);
        IntroToEE.removeCourseFromModule(EE123);
        String checkMod = "EC234";
        String checker = IntroToEE.getModuleListname();
        assertTrue(checker.contains(checkMod));
    }
    @Test
    public void testAddStudentToCourse(){
    IntroToEE.addStudentToCourse(testStudent1);
    IntroToEE.addStudentToCourse(testStudent2);
    IntroToEE.removeStudentFromCourse(testStudent2);
    String checkStudent = "Brendan";
    String checkerStudent = IntroToEE.getStudentListname();
    assertTrue(checkerStudent.contains(checkStudent));

}




}
