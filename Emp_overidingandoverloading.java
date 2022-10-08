class Person {
  int id;
  String name;
  String phone;
  

  Person(int id, String phone, String name) {
    this.id=id;
    this.name = name;
    this.phone= phone;
  }
  void show(String person1){
    System.out.println("Employee parent brother name: "+person1);
  }
}

class Employee extends Person {
  
  int emp_salary;

  Employee(int id, String name, String phone, int salary) {
    super(id, phone, name);
    this.emp_salary = salary;
  }


  void printEmployeeDetails() {
    System.out.println("Employee ID     :  " + id);
    System.out.println("Employee Name   :  " + name);
    System.out.println("Employee phone   :  " + phone);
    System.out.println("Employee salary :  "+ emp_salary);
  }

  void printEmployeeDetails(int tax) {
    System.out.println("Employee salary :  "+ (emp_salary-tax));
    System.out.println("Tax deducted :  "+ tax);
  }
  void show(String person2){
    System.out.println("Employee child brother name: "+person2);
  }

}

public class Emp_overidingandoverloading {
  public static void main(String[] args) {
    Person p = new Person(646, "9686515970", "Rahul Chavan");
    Employee emp = new Employee(646, "9686515970", "Rahul Chavan", 45000);
     

     //method overloading
    emp.printEmployeeDetails();
    emp.printEmployeeDetails(5000);

    //method overriding
    p.show("Rohit");

  }
}
