public class Student {

    // 1. Encapsulation is the privite fields vairibles.
    private String name;
    private int studentId;

    // 2. Constructor initialize the value.
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // 3. Getter for name it is only read the name.
    public String getName() {
        return name;
    }

    // 4. Setter for name it is changing or update name.
    public void setName(String name) {
        this.name = name;
    }

    // 5. Getter for studentId only read the id.
    public int getStudentId() {
        return studentId;
    }

    // 6. Setter for studentId update of id.
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}