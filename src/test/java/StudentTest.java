import junit.framework.TestCase;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentTest extends TestCase {
    Student testStudent = new Student("Brendan", 22, LocalDate.of(1999,01,02),13);
    Module EE123    = new Module("IntroToEE", 12345);
    Module EC234 = new Module("EC234", 1976);
    DateTime CompSciStartTime = new DateTime(2021, 01, 19, 9, 00);
    DateTime CompSciEndTime = new DateTime(2021, 10, 20, 9, 00);
    DateTime startTime = new DateTime(2021, 1, 1, 2, 30);
    DateTime endTime =  new DateTime(2021, 12, 31, 2, 30);
    Course IntroToEE = new Course("IntroToEE",startTime, endTime);
    Course IntroToCompSci = new Course("IntroToCompSci", CompSciStartTime, CompSciEndTime);
    @Test
    public void testGetUsername() {
        //Student testStudent = new Student("Brendan", 22, LocalDate.of(1999,01,02),11);
        String testUsername= testStudent.getUsername();
        assertEquals("Brendan13",testUsername);
    }
    @Test
    public void testAddModule(){
        testStudent.addModule(EE123);
        testStudent.addModule(EC234);
        testStudent.removeModule(EE123);
        String testMod = "EC234";
        String checker = testStudent.getModuleAssociatedWithStudent();
        assertTrue(checker.contains(testMod));
    }
    @Test
    public void testSetCourseReg(){
        testStudent.setCourseReg(IntroToCompSci);
        String testCourse = "IntroToCompSci";
        String checkerCourse = testStudent.getCourseReg();
        assertTrue(checkerCourse.contains(testCourse));
    }


}