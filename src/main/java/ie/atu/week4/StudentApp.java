package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //First student using default constructor
        Student firstPerson = new Student();
        System.out.println("Enter student 1 name: ");
        firstPerson.setName(sc.nextLine());
        System.out.println("Enter student 1 email:  ");
        firstPerson.setEmail(sc.nextLine());
        System.out.println("Enter student 1 course: ");
        firstPerson.setCourse(sc.nextLine());

        //Second Student using a constructor that only accepts name

        System.out.println("Enter student 2 name: ");
        String name2 = sc.nextLine();
        Student secondPerson = new Student(name2);
        System.out.println("Enter student 2 email: ");
        secondPerson.setEmail(sc.nextLine());
        System.out.println("Enter student 2 course: ");
        secondPerson.setCourse(sc.nextLine());

        //Third student using a constructor that accepts name, email and course as parameters

        System.out.println("Enter student 3 name: ");
        String name3 = sc.nextLine();
        System.out.println("Enter student 3 email: ");
        String email3 = sc.nextLine();
        System.out.println("Enter student 3 course: ");
        String course3 = sc.nextLine();
        Student thirdPerson = new Student(name3, email3, course3);

        System.out.println(firstPerson.toString());
        System.out.println(secondPerson.toString());
        System.out.println(thirdPerson.toString());
    }
}
