import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String First;
    private String Last;
    private int Age;
    private double salary;

    public Employee() {
        
        Scanner scan = new Scanner(System.in);
	System.out.println("Please input the employee's first name: ");
	First = scan.nextLine();
	System.out.println("Please input the employee's last name: ");
	Last = scan.nextLine();
	System.out.println("Please input the employee's age: ");
      Age = scan.nextInt();
	System.out.println("Please input the employee's salary: ");
	salary = scan.nextDouble();

	
    }

    public String toString() {
	return "Employee informations: " + First +" " + Last + "," + Age + "," + salary;

        
    }
}