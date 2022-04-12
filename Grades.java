package ralph;

import java.util.Scanner;
public class Grades{
	public static void main(String[] args){
		Scanner scan_int =new Scanner(System.in);
		int[] number=new int[5];// new array of size 5
			for(int i=1;i<=5;i++){// loop that goes through and asks for each assignment 
			System.out.println("Input the grade of assignment"+ i + ": ");
			number[i-1] = scan_int.nextInt();
			}
		System.out.println("Input the number of labs you have attended: ");
		int labs = scan_int.nextInt();
		System.out.println("Input your midterm grade: ");
		int mid  = scan_int.nextInt();

		int sum = 0;
		for(int i=0;i<=4;i++){
		sum+=number[i];
		}

		System.out.println("Assignments which are 30 %:"+ (sum/7));
		System.out.println("Attendance which are 5%:"+(labs*100*0.05));
		System.out.println("Midterm which is 30%:"+ (mid*0.3));

	}
}

