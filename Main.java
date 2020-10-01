import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        Student john =new Student("john","poerk","1");
        Student marcus=new Student("marcus","erk","5");
        Student elizabeth =new Student("elizabeth","ean","7");
        Student maria=new Student("maria","tyeran","5");
        List<Teacher>teachers=new ArrayList<>();
        Teacher suzuki=new Teacher("suzuki",350);
        Teacher Honda=new Teacher("Honda",450);
        Teacher jetta=new Teacher("jetta",800);


        students.add(john);
        students.add(marcus);
        students.add(elizabeth);
        students.add(maria);


        teachers.add(suzuki);
        teachers.add(Honda);
        teachers.add(jetta);

        School sch1=new School(students,teachers);



        System.out.println(john.remaindepth());
        john.payfee(1000);
        System.out.println(john.remaindepth());
        john.payfee(2000);
        System.out.println(john.remaindepth());
        System.out.println(sch1.totalEarnaamontSchool());
        maria.payfee(5200);
        System.out.println(maria.remaindepth());
        System.out.println(sch1.totalEarnaamontSchool());
        elizabeth.payfee(4000);
        System.out.println(sch1.totalEarnaamontSchool());
        System.out.println(sch1.schoolBudget());
        System.out.println(suzuki.updateearnmoney(suzuki.getSalary()));
        System.out.println(sch1.schoolBudget());

        System.out.println(sch1.totalEarnaamontSchool());
        john.payfee(2000);
        System.out.println(john);
        System.out.println(sch1.schoolBudget());





    }
}
