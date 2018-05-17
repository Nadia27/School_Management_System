package school.management.system;

/**
 * Responsible for keeping track of teachers, id, name, and salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return id of teacher
     */

    public int getId(){
        return id;
    }

    /**
     * @return name of teacher
     */
    public String getName() {
        return name;
    }

    /**
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**set the salary*/
    public void setSalary(int salary){
        this.salary= salary;
    }

    /**
     * Adds to salary of teacher
     * Removes from total money earned from school
     * @param salary
     */
    public void recieveSalary(int salary) {
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher id: " + id + '\n' +
                "Teacher Name: " + name + '\n' +
                "Salary: $" + salary + '\n' +
                "Salary earned $" + salaryEarned;
    }
}
