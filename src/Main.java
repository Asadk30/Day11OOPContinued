import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        String[] javaStudents = {"Hamza", "Ismail", "Naimo", "Asad", "Yasin", "Daud"};
//        String[] webDevStudents = {"Raphael", "Leonardo", "Michaelangelo", "Donatello"};
//        CodingClassroom java = new CodingClassroom("Java and AWS", "Farhad", new String[] {"val 1", "val2", "val3"});

        ArrayList<String> javaStudents = new ArrayList<>();
        javaStudents.add("Hamza");
        javaStudents.add("Ismail");
        javaStudents.add("Naimo");
        javaStudents.add("Asad");
        javaStudents.add("Yasin");
        javaStudents.add("Daud");

        ArrayList<String> webDevStudents = new ArrayList<>();
        webDevStudents.add("Raphael");
        webDevStudents.add("Leonardo");
        webDevStudents.add("Michaelangelo");
        webDevStudents.add("Donatello");


        CodingClassroom java = new CodingClassroom("Java and AWS", "Farhad", javaStudents);
        CodingClassroom webDev = new CodingClassroom("Web Development", "Natsuki", webDevStudents);

        // Examples of how to access an object's properties. We specify the object name,
        // followed by a "." and then the property we want to access.
        System.out.println(java.classTitle);
//        System.out.println(java.students.length);

        // Recommendation: Have two sets of data that you invoke a method with so that you can
        //                 test and make sure your logic works with both sets of data.
        printStudents(java);
        printStudents(webDev);
    }


    public static void printStudents(CodingClassroom classroom) {
        System.out.println(classroom.classTitle);

        // We can access the students array of the object passed to this method
        // by writing "classroom" (the parameter) followed by ".students"
//        for (int i = 0; i < classroom.students.size(); i++) {
////            System.out.println(classroom.students[i]);
//            System.out.println(classroom.students.get(i));
//        }

        // Enhanced for loop is used if we want to perform the same task on every item
        // in a list.
        for (String student : classroom.students) {
            System.out.println(student.toUpperCase());
        }
    }

    public static void greet(String name) {
        System.out.println(name);
    }
}