import java.io.*;

class Student implements Serializable {
    private int studentID;
    private String name;
    private String grade;

    public Student(int studentID, String name, String grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public void display() {
        System.out.println("StudentID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class StudentSerializationDemo {
    public static void main(String[] args) {
        String filename = "student.ser";

        Student student = new Student(101, "Tushar", "A");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(student);
            System.out.println("Serialization complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Deserialization complete.");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
