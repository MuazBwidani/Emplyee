
package homeworkemployee;
public class Employee {
    String Name;
    String SorName;
    double Salary;
    
    public String getName(){
        return Name;
    }
    public void setName(String na){
        Name=na;
    }
    public String getSorName(){
        return SorName;
    }
    public void SetSorName(String Sna){
       SorName=Sna;
    }
    public double getSalary(){
        return  Salary;
    }
    public void SetSalary(double Sa){
        if(Sa>=0)
        {Salary=Sa;}
        else
        {
         System.out.println("We Don't set the salary because it is pozitif");
        }
            
    }
    public void EmptyEmployee() {
        Name= "";
        SorName= "";
        Salary = 0.0;

    }
    public void Addition() {
        Salary = Salary + Salary* 0.1;
    }
    public void print(Employee emp){
     System.out.println("The name of employee "+emp.Name);
      
      System.out.println("The SorName of employee "+emp.SorName);
      
      System.out.println("The Salary of employee "+emp.Salary);
}}
    