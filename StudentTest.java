import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student defaultStudent = new Student();
        System.out.println("Default Student Info:");
        System.out.println("Name: " + defaultStudent.getName());
        System.out.println("OSIS: " + defaultStudent.getOSIS());
        System.out.println("Grade Level: " + defaultStudent.getGrade());

        System.out.println("\nEnter Student Details:");
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("OSIS: "); String OSIS = sc.nextLine();
        System.out.print("Grade Level: "); String grade_level = sc.nextLine();

        Student userStudent = new Student(name, OSIS, grade_level);
        System.out.println("\nUser-Provided Student Info:");
        System.out.println("Name: " + userStudent.getName());
        System.out.println("OSIS: " + userStudent.getOSIS());
        System.out.println("Grade Level: " + userStudent.getGrade());

        // Call and display getRandomOSIS() and getRandomName()
        System.out.println("\nRandomly Generated Values:");
        System.out.println("Random OSIS: " + defaultStudent.getRandomOSIS());
        System.out.println("Random Name: " + defaultStudent.getRandomName());
    }
}