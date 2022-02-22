
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
    public class EntryPoint {
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int x = 0;
            int rand = (int)(Math.random() * 10);
            while (x<rand){
                System.out.print("Please input the employee's first name: ");
                String FirstName= sc.next();
                System.out.print("Please input the employee's last name: ");
                String LastName= sc.next();
                System.out.print("Please input the employee's age: ");
                int Age= sc.nextInt();
                System.out.print("Please input the employee's MonthlySalary: ");
                double MonthlySalary= sc.nextDouble();
                Employee Person= new Employee (FirstName,LastName,Age,MonthlySalary);
                System.out.println("Employee information:" + Person.FirstName + " " + Person.LastName + ", " + Person.Age + ", " + Person.MonthlySalary);
                x++;
                int Executions = rand-x;
                System.out.println("You have " + Executions + " insertions left");
            }
        }
    }


