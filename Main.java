package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher Rekha = new Teacher(1,"Rekha",500);
        Teacher Aneeta = new Teacher(2,"Aneeta",700);
        Teacher Neeraj = new Teacher(3,"Neeraj",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Rekha);
        teacherList.add(Aneeta);
        teacherList.add(Neeraj);


        Student Yugander = new Student(1,"Yugander",4);
        Student Asim = new Student(2,"Asim",12);
        Student Kartikey = new Student(3,"Kartikey",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Yugander);
        studentList.add(Kartikey);
        studentList.add(Asim);




        School CJM = new School(teacherList,studentList);

        Teacher Mehgna = new Teacher(6,"Mehgna", 900);

        CJM.addTeacher(Mehgna);


        Yugander.payFees(5000);
        Asim.payFees(6000);
        System.out.println("CJM has earned Rs"+ CJM.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Rekha.receiveSalary(Rekha.getSalary());
        System.out.println("CJM has spent for salary to " + Rekha.getName()
        +" and now has Rs" + CJM.getTotalMoneyEarned());

        Neeraj.receiveSalary(Neeraj.getSalary());
        System.out.println("CJM has spent for salary to " + Neeraj.getName()
                +" and now has Rs" + CJM.getTotalMoneyEarned());


        System.out.println(Asim);

        Aneeta.receiveSalary(Aneeta.getSalary());

        System.out.println(Aneeta);


    }
}