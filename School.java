import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher>teachers;
    private  static int schoolTotalearnMoney;
    private static int schoolTotalexpenseMoney;

    public School(List<Student> students,List<Teacher>teachers) {
        this.students = students;
        this.teachers=teachers;
        schoolTotalexpenseMoney =0;
        schoolTotalearnMoney =0;
    }

    /**
     * this method is calculating earninmoney of school
     * @param payment
     * @return schoolTotalearnMoney
     */
    static  int schoolEraningmoney(int payment){
        schoolTotalearnMoney +=payment;
        return schoolTotalearnMoney;
    }

    /**
     * This method sending total arn money of school
     * @returnschoolTotalearnMoney
     */
    public  int totalEarnaamontSchool(){
        return schoolTotalearnMoney;
    }

    /**
     * this method is  using for  the school  is spending money (for salary payment)
     * @param salary
     * @returnschoolTotalexpenseMoney
     */
    static int schoolSpendingmoney(int salary){
        schoolTotalexpenseMoney +=salary;
        return schoolTotalexpenseMoney;
    }

    /**
     * this method is calculting total last budget amount of school
     * @return school budget
     */

    public int schoolBudget(){
        return (schoolTotalearnMoney - schoolTotalexpenseMoney);
    }
}
