package ie.atu.week4;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //Prompt user for details
        Scanner sc = new Scanner(System.in);

        //first student
        Student firstStudent = new Student();
        firstStudent.setName("Mia");
        firstStudent.setEmail("miaacton@gmail.com");
        firstStudent.setCourse("Engineering");

        System.out.println(firstStudent.toString());
    }
}

