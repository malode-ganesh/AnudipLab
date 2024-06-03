import java.util.HashSet;
import java.util.Objects;

class Student {
    private int studentID;
    private String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.studentID == other.studentID;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
    }
}

public class Test03 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Charlie");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        Student student4 = new Student(1, "David");
        students.add(student4); // This student will not be added because student1 and student4 have the same studentID

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
