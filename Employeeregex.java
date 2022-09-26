
import java.util.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employeeregex
{
    String Emp_email;
    String Emp_id;
    String Emp_Phone;
    String Emp_add;
    String reg;

    public static void main(String[] args)
    {
        System.out.println("Hii choose any one option out of 4 :\n");
        System.out.println("1.");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();

        switch (number)
        {
            case 1:
                System.out.println("1.Emp_email");
                String Emp_email = sc.next();
                String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
                boolean res = Emp_email.matches(regex);
                if(res){
                    System.out.println("valid");
                }
                else {
                    System.out.println("Not valid");
                }
                break;
            case 2:
                System.out.println ("2.Emp_id");
                String Emp_id = sc.next();
                String reg2="^[AMT]+[0-9]+$";
                boolean res1=Emp_id.matches(reg2);
                if(res1){
                    System.out.println("valid");
                }
                else {
                    System.out.println("Not valid");
                }
                break;
            case 3:
                System.out.println("3.Emp_Phone");
                String Emp_Phone = sc.next();
                String reg3="^\\+?[0-9-]+$";
                boolean res2=Emp_Phone.matches(reg3);
                if(res2){
                    System.out.println("valid");
                }
                else {
                    System.out.println("Not valid");
                }
                break;
            case 4:
                System.out.println("4.Emp_add");
                String Emp_add= sc.next();
                String reg4="^[a-zA-Z0-9\\s\\,\\''\\-]*$";
                boolean res3=Emp_add.matches(reg4);
                if(res3){
                    System.out.println("valid");
                }
                else {
                    System.out.println("Not valid");
                }
                break;
        }
    }
}
