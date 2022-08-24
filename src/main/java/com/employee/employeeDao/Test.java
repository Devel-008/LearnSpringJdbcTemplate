package com.employee.employeeDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
       Scanner sc = new Scanner(System.in);
       int id;
       String name;
       float salary;
       int choice;

        do {
            System.out.println("PRESS 1 to INSERT\nPRESS 2 to UPDATE\nPRESS 3 to DELETE\nPRESS anyother key to exit: := ");
            choice = sc.nextInt();

            if(choice==1) {
                System.out.print("Enter id:=");
                id = sc.nextInt();
                System.out.println("Enter name:");
                name = sc.next();
                System.out.println("Enter salary");
                salary = sc.nextFloat();

                int status = dao.saveEmployee(new EmployeeData(id, name, salary));
                System.out.println(status);
            }
            else if (choice==2){
                System.out.println("Enter id of employee whom you want to update:=");
                id = sc.nextInt();
                System.out.println("Enter Name=:");
                name = sc.next();
                System.out.println("Enter Salary=:");
                salary = sc.nextFloat();

                int status = dao.updateEmployee(new EmployeeData(id,name,salary));
                System.out.println(status);
            }
            else if (choice==3){
                System.out.println("Enter the id of employee whose data you want to delete:=");
                id = sc.nextInt();

                int status = dao.deleteEmployee(new EmployeeData(id));
                System.out.println(status);
            }
            else {
                System.out.println("Incorrect Choice!!!");
                System.exit(0);
            }
        }while (choice<=3&&choice>=1);
        System.out.println("Process Successful");

    }
}