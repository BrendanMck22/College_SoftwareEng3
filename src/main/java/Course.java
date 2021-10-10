import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<Module> moduleList;
    ArrayList<Student> studentList;
    LocalDate startDate;
    LocalDate endDate;

    public Course(String courseName, ArrayList<Module> moduleList, ArrayList<Student> studentList, LocalDate startDate, LocalDate endDate){
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.studentList = studentList;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}