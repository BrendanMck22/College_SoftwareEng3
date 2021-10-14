import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    String name;
    int age;
    LocalDate DOB;
    int ID;
    ArrayList<Course> courses;
    ArrayList<Module> modules;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DOB=" + DOB +
                ", ID=" + ID +
                ", courses=" + courses +
                ", modules=" + modules +
                '}';
    }

}