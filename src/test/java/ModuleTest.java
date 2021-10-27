import junit.framework.TestCase;
import org.joda.time.DateTime;
import org.testng.annotations.Test;


import java.time.LocalDate;

public class ModuleTest extends TestCase {
    Module EE123    = new Module("IntroToEE", 12345);
    DateTime CompSciStartTime = new DateTime(2021, 01, 19, 9, 00);
    DateTime CompSciEndTime = new DateTime(2021, 10, 20, 9, 00);
    DateTime startTime = new DateTime(2021, 1, 1, 2, 30);
    DateTime endTime =  new DateTime(2021, 12, 31, 2, 30);
    Course IntroToEE = new Course("IntroToEE",startTime, endTime);
    Course IntroToCompSci = new Course("IntroToCompSci", CompSciStartTime, CompSciEndTime);
    Student testStudent1 = new Student("Brendan", 22, LocalDate.of(1999,01,02),13);
    Student testStudent2 = new Student("Adam", 21, LocalDate.of(2000,01,02),155);

    @Test
    public void testModName() {
        String modname = EE123.getModName();
        assertEquals("IntroToEE", modname);
    }
    @Test
    public void testAddModuleToCourse(){
        EE123.addModuleToCourse(IntroToEE);
        EE123.addModuleToCourse(IntroToCompSci);
        EE123.removeModuleFromCourse(IntroToCompSci);
        String checkCourse = "IntroToEE";
        String checkerCourse = EE123.getModuleAssociatedCoursesListname();
        assertTrue(checkerCourse.contains(checkCourse));
    }
    @Test
    public void testAddStudentToModule(){
        EE123.addStudentToModule(testStudent1);
        EE123.addStudentToModule(testStudent2);
        EE123.removeStudentFromModule(testStudent1);
        String checkStudent = "Adam";
        String checkerStudent = EE123.getStudentList();
        assertTrue(checkerStudent.contains(checkStudent));

    }



}
