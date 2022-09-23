 class Student{
    private final String name;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class Immutableclass {
    public static void main(String args[]){
        Student s1 = new Student("Rahul");
        System.out.println(s1.getName());
        s1.getName().concat("Chavan");
        System.out.println(s1.getName());
    }
}