public class Student {
    private String sname;
    private String surname;
    private String sclass;
    int payfee;
    int totaldepth;

    public Student(String sname, String surname, String sclass) {
        payfee =0;
        totaldepth =10000;
        this.sname = sname;
        this.surname = surname;
        this.sclass = sclass;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    /**
     * This  method is using when student want to  make a payment for school fee
     * @param paymentamont
     */

    public   void payfee(int paymentamont){
        payfee +=paymentamont;
        School.schoolEraningmoney(paymentamont);


    }

    /**
     * This method is calculating reaminingdepth amount for student
     * @return
     */
    public int remaindepth(){
        totaldepth -= payfee;
        return totaldepth;
    }

    @Override
    public String toString() {
        return "name is "+sname+"he/she's paid  totaly $"+payfee;
    }
}
