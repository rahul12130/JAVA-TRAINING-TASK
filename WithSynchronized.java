public class WithSynchronized {
    int count = 0;
   synchronized void Increment() throws InterruptedException {
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        WithSynchronized ds = new WithSynchronized();
        class T1 extends Thread{
            @Override
            public void run() {
                int i;
                try {
                    for ( i=0; i<1000; i++){
                        ds.Increment();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        class T2 extends Thread{
            @Override
            public void run() {
                int i;
                try {
                    for (i=0; i<1000; i++){
                        ds.Increment();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        T1 t1 =new T1();
        T2 t2 =new T2();
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(ds.count);
    }
}