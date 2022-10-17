

import java.util.*;
class Employee {
    int Emp_Id;
    String Emp_name;
    String Emp_issueDescription;

   public Employee(int Emp_Id, String Emp_name, String Emp_issueDescription) {
       this.Emp_Id=Emp_Id;
       this.Emp_name=Emp_name;
       this.Emp_issueDescription=Emp_issueDescription;
       System.out.println("");

   }

}


public class Employeemangement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("__________________________________________________________");
        System.out.println("Welcome to Amantya!");
        System.out.println("__________________________________________________________");

        System.out.println("Hi choose any Team: ");
        System.out.println("1.First One is the IT Team:  ");
        System.out.println("2. Second one is the HR Team: ");
        System.out.println("3. Third one is the Finace Team: ");
        System.out.println("4. Fourth one is Facility Team");

        int i = sc.nextInt();
        switch (i) {
            case 1:
                List list1 = new ArrayList<>();
                System.out.println(" IT Team");
                System.out.println("");
        }
    }
}