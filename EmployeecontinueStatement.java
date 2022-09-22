import java.util.*;

class EMPLOYEE{

   int id;  
    String name;
    String address;
    String type;
    String phone;

   public EMPLOYEE(int id, String x, String y, String z, String p){
        this.id = id;
        this.name = x;
        this.address = y;
        this.type = z;
        this.phone = p;

   }

   void DisplayEmployeedetails(){

           System.out.println("Empl_ID: "+id+"\tName: "+name+"\tAddress: "+address+"\tType: "+type+"\tPhone: "+phone);
    
    }

}

class EmployeecontinueStatement{

   public static void main(String args[]){
        EMPLOYEE e1 = new EMPLOYEE(1,"Kartik","Hassan", "SD", "9686515971");
        EMPLOYEE e2 = new EMPLOYEE(2,"Rahul","kamalapur", "SE", "9686515970");
        EMPLOYEE e3 = new EMPLOYEE(3,"SRIKAR","Tumkur", "HR", "9686515972");
        EMPLOYEE e4 = new EMPLOYEE(4,"Mohit","Bangalore", "PD", "9686515973");
        EMPLOYEE e5 = new EMPLOYEE(5,"Naveen","sirsi", "infra", "9686515974");
        EMPLOYEE e6 = new EMPLOYEE(6,"Sagar","Bijapur", "RND", "9686515975");
        EMPLOYEE e7 = new EMPLOYEE(7,"Krishna","Kalaburagi", "SDA", "9686515976");
        EMPLOYEE e8 = new EMPLOYEE(8,"Tejas","mysore", "DSA", "9686515977");
        EMPLOYEE e9 = new EMPLOYEE(9,"SAnju","Bagalkote", "SE", "9686515978");
        EMPLOYEE e10 = new EMPLOYEE(10,"Suresh","Bangalore", "SE", "9686515979");

        ArrayList<EMPLOYEE> empArray = new ArrayList<>();

       empArray.add(e1);
        empArray.add(e2);
        empArray.add(e3);
        empArray.add(e4);
        empArray.add(e5);
        empArray.add(e6);
        empArray.add(e7);
        empArray.add(e8);
        empArray.add(e9);
        empArray.add(e10);

       for (EMPLOYEE employee: empArray){
            if(employee.id%2 != 0)
                continue;
            employee.DisplayEmployeedetails();
        }



   }
}
