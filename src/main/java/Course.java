
import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<Module> moduleList;
    ArrayList<Student> studentList;
    DateTime startDate;
    DateTime endDate;

    public Course(String courseName,DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.moduleList = new ArrayList<Module>();
        this.studentList = new ArrayList<Student>();
    }

    public void addCourseToModule(Module module){
        if(!moduleList.contains(module)){
            moduleList.add(module);
            module.addModuleToCourse(this); //flag
        }
    }
    public void removeCourseFromModule(Module module){
        if(moduleList.contains(module)) {
            moduleList.remove(module);
            module.removeModuleFromCourse(this);
        }
    }

    public void addStudentToCourse(Student student){
        if(!studentList.contains(student)){
            studentList.add(student);
            student.setCourseReg(this);
        }
    }
    public void removeStudentFromCourse(Student student){
        if(studentList.contains(student))
        studentList.remove(student);
        student.removeStudent();
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

    public String getModuleListname(){
        StringBuilder moduleSB = new StringBuilder();

        for(Module module : moduleList){
            moduleSB.append(module.getModName());
            moduleSB.append(" ");
        }

        String moduleString = moduleSB.toString();
        return moduleString;
    }
    public String getStudentListname(){
        StringBuilder studentSB = new StringBuilder();

        for(Student student : studentList){
            studentSB.append(student.getName());
            studentSB.append(" ");
        }

        String studentString = studentSB.toString();
        return studentString;
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
                ", moduleList=" + getModuleListname() +
                ", studentList=" + this.getStudentList() +
                ", startDate=" + startDate +
                ", endDate=" + endDate +

                '}';
    }
}