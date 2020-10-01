public class Teacher {
    private String name;

    private int salary;
    int totalearnmoney;

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
        totalearnmoney=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * this method is using for  to make a payment   to teachers
     * @param salary
     * @return totalearnmoney
     */
    public  int updateearnmoney(int salary){

        totalearnmoney+=salary;
        School.schoolSpendingmoney(salary);
        return totalearnmoney;

    }
}
