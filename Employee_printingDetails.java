class Person {
  int id;
  String name;
  String phone;
  String salary;

  Person(String phone, String name) {
    this.id=id;
    this.name = name;
    this.phone= phone;
  }
}

class Employee extends Person {
  int emp_id;
  String emp_phone;

  Employee(int id, String name, String phone) {
    super(phone, name);
    emp_id = id;
    emp_phone = phone;
  }

  void printEmployeeDetails() {
    System.out.println("Employee ID     :  " + emp_id);
    System.out.println("Employee Name   :  " + name);
    System.out.println("Employee phone   :  " + phone);
  }
}

public class jp1 {
  public static void main(String[] args) {
    Employee emp = new Employee(646, "Rahul Chavan", "9686515970");
    emp.printEmployeeDetails();
  }
}
