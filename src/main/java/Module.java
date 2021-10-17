import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class Module {
    String modName;
    int modID;
    ArrayList<Student> studentsList;
    ArrayList<Course> associatedCourses;

    public Module(String modName, int modID){
        this.modName = modName;
        this.modID = modID;
        this.studentsList = new ArrayList<Student>();
        this.associatedCourses = new ArrayList<Course>();

    }

    public void addModuleToCourse(Course course){
        if(!associatedCourses.contains(course)){
            associatedCourses.add(course);
        }
    }
    public void removeModuleFromCourse(Course course){
        associatedCourses.remove(course);
    }
    public void addStudentToCourse(Student student){
        if(!studentsList.contains(student)){
            studentsList.add(student);
        }
    }
    public void removeStudentFromCourse(Student student){
        studentsList.remove(student);
    }






    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public int getModID() {
        return modID;
    }

    public void setModID(int modID) {
        this.modID = modID;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public ArrayList<Course> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<Course> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    @Override
    public String toString() {
        return "Module{" +
                "modName='" + modName + '\'' +
                ", modID=" + modID +
                ", studentsList=" + studentsList +
                ", associatedCourses=" + associatedCourses +
                '}';
    }
}