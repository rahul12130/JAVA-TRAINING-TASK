import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class HundredtaskwithCachethread extends Thread
{
    public void run()
    {
        System.out.println("Thread "+Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        int i;
        ExecutorService service = Executors.newCachedThreadPool();
        for(i=1;i<=100;i++)
        {
            service.execute(new HundredtaskwithCachethread());
        }
    }
}