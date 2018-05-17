package school.management.system;

import  java.util.List;

/**
 * Many teachers and students
 * teacher and student using ArrayList
 */
public class  School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent= 0;
    }

    /**
     *
     * @return list of teachers in school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * List of students in school
     * @return list students in school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @return  the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @return All the money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Add teacher to school
     * @param teacher the teacher to the school
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Adds Student to school
     * @param student  to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned money that supposed to be added
     */
    public static void updateTotalEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * update the money spent by the school...salaries given to teachers
     * @param moneySpent the money spent by school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
