

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
            course.addCourseToModule(this);
        }
    }
    public void removeModuleFromCourse(Course course){
        if(associatedCourses.contains(course)) {
            associatedCourses.remove(course);
            course.removeCourseFromModule(this);
        }
    }
    public void addStudentToModule(Student student){
        if(!studentsList.contains(student)){
            studentsList.add(student);
            student.addModule(this);
        }
    }
    public void removeStudentFromModule(Student student) {
        if(studentsList.contains(student))
        studentsList.remove(student);
        student.removeModule(this);
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

    public String getStudentList(){
        StringBuilder moduleStudentListSB = new StringBuilder();

        for(Student student : studentsList){
            moduleStudentListSB.append(student.name);
            moduleStudentListSB.append(" ");
        }

        String moduleStudentString = moduleStudentListSB.toString();
        return moduleStudentString;
    }
    public String getModuleAssociatedCoursesListname(){
        StringBuilder moduleCoursesSB = new StringBuilder();

        for(Course course : associatedCourses){
            moduleCoursesSB.append(course.getCourseName());
            moduleCoursesSB.append(" ");
        }

        String moduleCourseString = moduleCoursesSB.toString();
        return moduleCourseString;
    }

    @Override
    public String toString() {
        return "Module{" +
                "modName='" + modName + '\'' +
                ", modID=" + modID +
                ", studentsList=" + getStudentList() + //flag
                ", associatedCourses=" + getModuleAssociatedCoursesListname() +
                '}';
    }
}