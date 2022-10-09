import java.util.HashMap;
import java.util.Map;

class Employee {
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;

    }
    public int hashCode()
    {
        int hashcode = 0;
        return hashcode;

    }
    public boolean equals(Object obj)
    {
        if (obj instanceof Employee) {
            Employee emp = (Employee)obj;
            return (emp.name.equals(this.name)
                    && emp.id == this.id);
        }
        else {
            return false;
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

class Empproperkey {
    public static void main(String[] args) {

        Map<Employee, Integer> map = new HashMap<Employee, Integer>();
        Employee emp1 = new Employee(1, "Rahul");
        Employee emp2 = new Employee(2, "Abhi");
        Employee emp3 = new Employee(3, "Suresh");
        Employee emp4 = new Employee(4, "Prajwal");
        Employee emp5 = new Employee(5, "Dhiraj");
        Employee emp6= new Employee(6, "Ronak");
        Employee emp7 = new Employee(7, "Karan");
        Employee emp8= new Employee(8, "Kartik");
        Employee emp101 = new Employee(1, "Rahul1");

        map.put(emp1, 1);
        map.put(emp2, 2);
        map.put(emp3, 3);
        map.put(emp4, 4);
        map.put(emp5, 5);
        map.put(emp6, 6);
        map.put(emp7, 7);
        map.put(emp8, 8);
        map.put(emp101, 1);

        for (Map.Entry<Employee, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }


    }
}
