package schoolms;

/**
 * This is class is responsible for keeping track of students, names, fees, grade, a paid fees.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /** To create a new student object by initialing the value
     * Fees for every student $30,000/year
     * Fees paid initially is 0
     * @param id id for the student: unique.
     * @param name name of student
     * @param grade grade of the student
     * */
    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal= 30000;
        this.id = id;
        this.name =  name;
        this.grade = grade;
    }

    /**used to update the student grade.
     *
     * @param grade new grade of student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding  the fees to the feesPaid Field
     * Add the fees to the fees paid
     * The school will receive the funds.
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalEarned(feesPaid);
    }

    /**
     *
     * @return id of student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade level of student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return fees total of student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student id: " + id + '\n' +
                "Student name: " + name + '\n' +
                "Grade: " + grade + '\n' +
                "Fees paid : $" + feesPaid + '\n' +
                "Remaining balance: $" + feesTotal;

    }
}


