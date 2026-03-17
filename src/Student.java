public class Student {
    private String name;
    private int studentID;
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
         //  Getter for name
    public String getName() {
        return name;
    }

    //  Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //  Getter for studentId
    public int getStudentID() {
        return studentID;
    }

    //  Setter for studentId
    public void setStudentID(int studentId) {
        this.studentID = studentId;
    }


}