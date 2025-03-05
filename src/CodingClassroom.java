/*
Classes are use for:
1. Encasing similar methods.
2. Classes can also be used as blueprints to create objects.
    a. Objects are used to represent real-world entities.
 */

import java.util.ArrayList;

public class CodingClassroom {
    // These properties are used to represent the properties that an object of a classroom would have.
    String classTitle;
    String instructorName;
    //    String[] students;
    ArrayList<String> students = new ArrayList<>();

    public CodingClassroom(String classTitle, String instructorName, ArrayList<String> students) {
        this.classTitle = classTitle;
        this.instructorName = instructorName;
        this.students = students;
    }
}