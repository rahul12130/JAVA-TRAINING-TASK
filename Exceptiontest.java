
public class Exceptiontest {

    public static void main(String[] args) {
        int i=0;
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
        try
        {
            int age=18;
            if(age<18) {
                throw new ArithmeticException();
            }
            else {
                System.out.println("not a exception");
            }
           //may throw exception
            int[] arr = new int[5];

            try {
                int data=10/i;
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            //arr[6]=5;
        }
        //handling the exception
        catch(ArrayIndexOutOfBoundsException  e)
        {
            System.out.println(e);
            System.out.println("run");
        }
        finally {
            System.out.println("finally! statement is excecuted");
        }
        System.out.println("Statement 4");
        System.out.println("Statement 5");
    }

}
