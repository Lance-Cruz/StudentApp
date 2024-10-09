package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student firstPerson = new Student();
        System.out.println("Enter student 1 name: ");
        firstPerson.setName(sc.nextLine());
        System.out.println("Enter student 1 email:  ");
        firstPerson.setEmail(sc.nextLine());
        System.out.println("Enter student 1 course: ");
        firstPerson.setCourse(sc.nextLine());

        System.out.println(firstPerson.toString());



        /*Student firstPerson = new Student();
        firstPerson.setName("Lance");
        firstPerson.setEmail("g00428876@atu.ie");
        firstPerson.setCourse("Software");
        System.out.println(firstPerson.toString());*/

        /*second student

        Student secondPerson = new Student("Tommy");
        System.out.println(secondPerson.toString());

        //third student

        Student thirdPerson = new Student("John","John@atu.ie","Physics");
        System.out.println(thirdPerson.toString());*/
    }
}
