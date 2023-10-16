/*TODO:
 - Major
 - Vilka studenter i vilken stad
 - Skolor för stundetner i samma stad
 -
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        Student student1 = new Student("Axel", 42069);
        Student student2 = new Student("Sebastian", 14000);
        Student student3 = new Student("Loke", 21100);
        Student student4 = new Student("Jennifer", 15000);
        System.out.println("What is the students name and id?: ");


        City city1 = new City("Stockholm", "Sweden");
        City city2 = new City("Helsinki", "Finlandia");

        student1.setHometown(city1);
        city1.addStudentToTown(student1);

        student2.setHometown(city1);
        city1.addStudentToTown(student2);

        student3.setHometown(city2);
        city2.addStudentToTown(student3);

        student4.setHometown(city2);
        city2.addStudentToTown(student4);

        student1.setBuddy(student2);

        city1.getStudentsFromTown();
        city2.getStudentsFromTown();

        System.out.println(student1.getName() + "'s buddy is " + student1.reportBuddyName());

    }

}