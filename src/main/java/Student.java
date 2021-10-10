import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        Student Brendan = new Student("Brendan", 22, LocalDate.of(1999,01,02),11);
        String test = Brendan.getUsername();
        System.out.println(test);
    }
    String name;
    int age;
    LocalDate DOB;
    int ID;
//    ArrayList<String> courses;
//    ArrayList<String> modules;

    public Student(String name, int age, LocalDate DOB, int ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
//        this.courses = courses;
//        this.modules = modules;
    }

    public String getUsername(){
        String username = name+ age;
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

//    public ArrayList<String> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(ArrayList<String> courses) {
//        this.courses = courses;
//    }
//
//    public ArrayList<String> getModules() {
//        return modules;
//    }
//
//    public void setModules(ArrayList<String> modules) {
//        this.modules = modules;
//    }
}