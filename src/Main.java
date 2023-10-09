public class Main {
    public static void main(String[] args) {

        Student Student = new Student("Axel", 42069);
        Student Student2 = new Student("Sebastian", 14000);
        Student Student3 = new Student("Loke", 21100);
        Student Student4 = new Student("Tobias", 15000);

        Cities City1 = new Cities("Stockholm", "Sweden");
        Cities City2 = new Cities("Helsinki", "Finlandia");
        Student.setHometown(City1);
        Student2.setHometown(City1);
        Student3.setHometown(City2);
        Student4.setHometown(City2);

        Student.setBuddy(Student2);

        Student.reportBuddyName();
        System.out.println(Student.reportBuddyName());

    }

}