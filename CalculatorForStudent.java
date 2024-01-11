import java.util.Scanner;
public class CalculatorForStudent {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your Student name : ");
            String StudentName = scan.next();
            System.out.print("Enter your Student Exam Roll No. : ");
            String Rollno = scan.next();
            System.out.println("Enter your Physics marks : ");
            int physics = scan.nextInt();
            System.out.println("Enter your English marks : ");
            int English = scan.nextInt();
            System.out.println("Enter your Chemistry marks : ");
            int chemistry = scan.nextInt();
            System.out.println("Enter your Mathematics marks : ");
            int mathematics = scan.nextInt();
            System.out.println("Enter your Computer Science marks : ");
            int computer = scan.nextInt();

            float percentage = ((physics + English + chemistry + mathematics + computer) / 500.0f) * 100;
            int TotalMarks = (physics + English + chemistry + mathematics + computer);
            System.out.println("Total Marks of " + StudentName);
            System.out.println("Roll no :" + Rollno);
            System.out.println("out off 500 is  :" + TotalMarks);
            System.out.println("percentage  :" + percentage);
        }
    }
}
