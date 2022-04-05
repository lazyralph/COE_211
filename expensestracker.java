package chapter2;
import java.io.*;
import java.util.Scanner;
public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
      Scanner scan=new Scanner(System.in);
      boolean cont=true;
       // Start gathering information inside the loop you will start
      while(cont){
      System.out.println("Input your name:");
      String nom=scan.nextLine();
      System.out.println("What did you purchase?");
      String purchase=scan.nextLine();
      System.out.println("how much did you pay?(in usd)");
      double payment=scan.nextDouble();
      File file = new File("expenses.txt");
      FileWriter fw = new FileWriter(file, true); 
      BufferedReader fr=new BufferedReader(new FileReader("expenses.txt"));
      String line;
      String output=nom+" purchaced "+purchase+" for "+payment+" US dollars \n";
      fw.write(output);
      scan.nextLine();
      System.out.println("Would you like to log another purchase? (y/n)");
      String answer=scan.nextLine();
      
      if (answer.equals("y")){
          cont=true;
      }
      else{
          System.out.println("Would you like to read a summary of your purchases?  (y/n)");
          String ans=scan.nextLine();
          if (ans.equals("y")){
              while((line = fr.readLine()) != null){
                  System.out.println(line);
                 }
            System.out.println("Get off of ZoodMall!");

          }
          else{
            System.out.println("Get off of ZoodMall!");
              break;
          }
          cont=false;
      }
      // Close ClassWriter & Scanner objects
      fw.close();
      
      }
      scan.close();
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}