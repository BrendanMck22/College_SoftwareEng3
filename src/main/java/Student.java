import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    String name;
    int age;
    LocalDate DOB;
    int ID;
    Course courseReg;
    ArrayList<Module> modulesReg;

    public Student(String name, int age, LocalDate DOB, int ID ){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        modulesReg = new ArrayList<Module>();

    }

    public String getUsername(){
        String username = name+ ID;
        return username;
    }
    public void addModule(Module module) {
        if (!modulesReg.contains(module)) {
            modulesReg.add(module);
            module.addStudentToModule(this); //flag
        }

    }
    public void removeModule(Module module) {
        if(modulesReg.contains(module)) {
            modulesReg.remove(module);
            module.removeStudentFromModule(this);
        }
    }

    public void addCourse(Course courseReg) {
        this.courseReg = courseReg;
    }

    public void setCourseReg(Course course){
        this.courseReg = course;
        course.addStudentToCourse(this);
    }
    public void removeStudent(){
        this.courseReg = null;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    public String getCourseReg(){
        return courseReg.courseName;
    }
    /*
    loops through modules the students are registered for array and
    appends names of modules to a string
     */
    public String getModuleAssociatedWithStudent(){
        StringBuilder moduleStudentSB = new StringBuilder();

        for(Module module: modulesReg){
            moduleStudentSB.append(module.getModName());
            moduleStudentSB.append(" ");
        }

        String moduleStudentString = moduleStudentSB.toString();
        return moduleStudentString;
    }

    public void printUsername(Student student){
        System.out.println("Username is : " + student.getUsername());
    }

    @Override
    public String toString() {
        return
                "Name of student  = " + name +
                ", Age of student = " + age +
                ", DOB = " + DOB +
                ", ID = " + ID +
                ", Username  = " + getUsername() +
                ", registered course = " + courseReg.getCourseName() +
                ", registered modules = " + this.getModuleAssociatedWithStudent()
                ;
    }

}