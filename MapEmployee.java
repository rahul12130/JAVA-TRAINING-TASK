import java.sql.SQLOutput;
import java.util.*;

class Employee1{
    int empid;
    String empname;

    Employee1(int id,String name ){
        this.empid=id;
        this.empname=name;
    }
    public String toString()
    {
        return empid+"  :"+empname;
    }
}
class MapEmployee {

    public static void main(String args[]) {
        Employee1 obj1= new Employee1(1,"Rahul");
        Employee1 obj2= new Employee1(2,"Abhi");
        Employee1 obj3= new Employee1(3,"Suresh");
        Employee1 obj4= new Employee1(4,"Ronak");
        Employee1 obj5= new Employee1(5,"Prajwal");
        Employee1 obj6= new Employee1(6,"Dhiraj");
        Employee1 obj7= new Employee1(7,"Karan");

        Map<Employee1,Integer> map = new HashMap<>();
        map.put(obj1,1);
        map.put(obj2,3);
        map.put(obj3,4);
        map.put(obj4,5);
        map.put(obj5,2);
        map.put(obj6,7);
        map.put(obj7,6);
        System.out.println(map);
    }

}