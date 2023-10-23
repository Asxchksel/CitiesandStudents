/*TODO:
 - Major
 - Vilka studenter i vilken stad
 - Skolor för stundetner i samma stad
 -
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("Axel", 42069);
        Student student2 = new Student("Sebastian", 14000);
        Student student3 = new Student("Loke", 21100);
        Student student4 = new Student("Jennifer", 15000);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);


        Scanner keyb = new Scanner(System.in);
        System.out.println("How many student do you want to add?: ");
        int addStudentAmount = keyb.nextInt();
        keyb.nextLine();
        String newStudentName; int newStudentID;

        for (int i = 0; i < addStudentAmount; i++) {
            System.out.println("What is the students name?: ");
            newStudentName = keyb.nextLine();
            System.out.println(newStudentName);

            System.out.println("And their studentID?: ");
            newStudentID = keyb.nextInt();
            keyb.nextLine();

            studentList.add(new Student(newStudentName, 0));
        }

        City city1 = new City("Stockholm", "Sweden");
        City city2 = new City("Helsinki", "Finlandia");

        student1.setHometown(city1);
        student2.setHometown(city1);
        student3.setHometown(city2);
        student4.setHometown(city2);

        System.out.println(studentList.size());

        printStudents(studentList);

        student1.setBuddy(student2);
        System.out.println(student2.getBuddy());

        city1.getStudentsFromTown();
        city2.getStudentsFromTown();

        System.out.println(student1.getName() + "'s buddy is " + student1.reportBuddyName());
    }

    public static ArrayList<Student> printStudents(ArrayList<Student> studentList){
        System.out.println(studentList.size());
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(i);
            System.out.println(studentList.get(i).getName());
        }
        return studentList;
    }
}