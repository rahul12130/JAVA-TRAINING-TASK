public class Tentaskwithtenthread extends Thread
{
    public void run()
    {
        System.out.println("Thread Name "+Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        int i;
        for( i=1;i<=10;i++)
        {
            Tentaskwithtenthread t1 = new Tentaskwithtenthread();
            t1.start();
        }
    }
}