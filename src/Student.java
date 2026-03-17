public class Student {

    // 🔒 Encapsulation is the hidden of data fields.
    private String name;
    private int studentId;

    // 🏗️ Constructor initialize the value.
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    } 
     // 📥 Getter for name
    public String getName() {
        return name;
    }

    // 📤 Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // 📥 Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // 📤 Setter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}