import java.util.ArrayList;

public class Class {
    ArrayList<String> studentGroup = new ArrayList<>();

    public void enrollStudent(String newStudent) {
        if (studentGroup.size() < 10) {
            studentGroup.add(newStudent);
            System.out.println("New student enrolled.");
        } else {
            System.out.println("This student group is already full!");
        }
    }
}
