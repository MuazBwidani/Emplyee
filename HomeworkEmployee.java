
package homeworkemployee;
import java.util.Scanner;


public class HomeworkEmployee {
   
    public static void read(Employee Emp){
        Scanner input=new Scanner(System.in);
        
      System.out.println("Please Enter the name of the employee ");
      Emp.setName(input.next());
      System.out.println("Please Enter the SorName of the employee ");
      Emp.SetSorName(input.next());
      System.out.println("Please Enter the Salary of the employee ");
      Emp.SetSalary(input.nextInt());
    }
   
    public static void main(String[] args) {
        Employee Emp1 = new Employee();
        Emp1.EmptyEmployee();
        Employee Emp2 = new Employee();
        Emp2.EmptyEmployee();
        
       read(Emp1);
       Emp1.print(Emp1);
       
       read(Emp2);
       Emp2.print(Emp2);
       
       Emp1.Addition();
       Emp2.Addition();
       System.out.println("The Employees After increase the salary ");
       Emp1.print(Emp1);
       Emp2.print(Emp2);
    }
    
}
