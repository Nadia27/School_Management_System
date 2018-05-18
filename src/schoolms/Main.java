package schoolms;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        double salary;

        /**Allows to read input */
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Teacher's first name:\n");
        firstName = keyboard.nextLine();
        System.out.print("Enter Teacher's last name:\n");
        lastName = keyboard.nextLine();
        System.out.print("Enter Teacher's salary:\n");
        salary = keyboard.nextDouble();




        String studentFirstName;
        String studentLastName;
        int studentGrade;
        double deposit;


        System.out.print("Enter the students");

       //School Partee = new School(/*teacherList,*/ studentList);


      /*  Xavier.payFees(4000);
        Micah.payFees(3000);
        System.out.println("Partee has earned $" + Partee.getTotalMoneyEarned());

        System.out.println("==================Making School Pay Salary============");
        Erica.recieveSalary(Erica.getSalary());
        Sydney.recieveSalary(Sydney.getSalary());
        System.out.println("Partee has spent for salary to " + Erica.getName() + " and " + Sydney.getName() +  " and now has $"+ Partee.getTotalMoneyEarned());

        System.out.println(Micah);
        System.out.println(Erica);*/
    }


}
