package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Sydney = new Teacher(1, "Sydney", 1500);
        Teacher Erica = new Teacher(2, "Erica", 900);
        Teacher James = new Teacher(3, "James", 1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Sydney);
        teacherList.add(Erica);
        teacherList.add(James);

        Student William = new Student(1, "William", 3);
        Student Xavier = new Student(2, "Xavier", 5);
        Student Micah = new Student(3, "Micah", 6);

        List<Student> studentList = new ArrayList<>();

        studentList.add(William);
        studentList.add(Xavier);
        studentList.add(Micah);

        School Partee = new School(teacherList, studentList);


        Xavier.payFees(4000);
        Micah.payFees(3000);
        System.out.println("Partee has earned $" + Partee.getTotalMoneyEarned());

        System.out.println("==================Making School Pay Salary============");
        Erica.recieveSalary(Erica.getSalary());
        Sydney.recieveSalary(Sydney.getSalary());
        System.out.println("Partee has spent for salary to " + Erica.getName() + " and " + Sydney.getName() +  " and now has $"+ Partee.getTotalMoneyEarned());

        System.out.println(Micah);
        System.out.println(Erica);
    }


}
