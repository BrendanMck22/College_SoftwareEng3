import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    String name;
    int age;
    LocalDate DOB;
    int ID;
    ArrayList<Course> coursesReg;
    ArrayList<Module> modulesReg;

    public Student(String name, int age, LocalDate DOB, int ID ){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;

    }

    public String getUsername(){
        String username = name+ ID;
        return username;
    }
    public void addModule(Module module) {
        if (!modulesReg.contains(module)) {
            modulesReg.add(module);
        }
    }
        public void removeModule(Module module)
        {
                modulesReg.remove(module);
        }
    public void addCourse(Course course) {
        if (!coursesReg.contains(course)) {
            coursesReg.add(course);
        }
    }

    public void removeCourse(Course course)
    {
            coursesReg.remove(course);
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

    public void printUsername(Student student){
        System.out.println("Username is : " + student.getUsername());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                ", ID=" + ID +
                ", courses=" + coursesReg +
                ", modules=" + modulesReg +
                '}';
    }

}