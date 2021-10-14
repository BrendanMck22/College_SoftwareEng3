import java.util.ArrayList;

public class Module {
    String modName;
    int modID;
    ArrayList<Student> studentsList;
    ArrayList<Student> associatedCourses;

    public Module(String modName, int modID){
        this.modName = modName;
        this.modID = modID;

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

    public ArrayList<Student> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<Student> associatedCourses) {
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