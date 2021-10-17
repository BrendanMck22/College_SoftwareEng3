import org.joda.time.DateTime;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<Module> moduleList;
    ArrayList<Student> studentList;
    DateTime startDate;
    DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.moduleList = new ArrayList<Module>();
        this.studentList = new ArrayList<Student>();
    }

    public void addModuleToCourse(Module module){
        if(!moduleList.contains(module)){
            moduleList.add(module);
        }
    }
    public void removeModuleFromCourse(Module module){
        moduleList.remove(module);
    }

    public void addStudentToCourse(Student student){

    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(ArrayList<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", moduleList=" + moduleList +
                ", studentList=" + studentList +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}