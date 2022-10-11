package com.practice.withoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        int choice;
        while (true) {
            System.out.println("""
                        1] Press 1 to INSERT 2] Press 2 to DELETE 3]Press 3 to READ\s
                        4]Press 4 to UPDATE 5]Press 5 to insert data from any\040
                        JSON-File in database\s6]Press any other key to exit""");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {

                    System.out.println(" Enter ID : ");
                    student.setId(sc.nextInt());
                    System.out.println(" Enter Name : ");
                    student.setName(sc.next());
                    studentDao.insert(student);
                }
                case 3 -> studentDao.getStudent(student,sc);

                default -> {
                    System.out.println("\nDo you want to continue:= Press any key or else Press 0 to exit!!");
                    int n = sc.nextInt();
                    if (n == 0) {
                        System.out.println("Process Successful");
                        return;
                    }
                }
            }
        }

       /* System.out.println(" Enter ID : ");
        student.setId(sc.nextInt());
        System.out.println(" Enter Name : ");
        student.setName(sc.next());
        System.out.println(" Enter City : ");
        student.setCity(sc.next());

        studentDao.insert(student);

        System.out.println(" Enter ID whom you want to update: ");
        student.setId(sc.nextInt());
        System.out.println(" Update Name : ");
        student.setName(sc.next());
        System.out.println(" Update City : ");
        student.setCity(sc.next());
        studentDao.update(student);

        List<Student> list=studentDao.getAllEmployees();

        for(Student e:list)
            System.out.println(e);*/


    }
}
