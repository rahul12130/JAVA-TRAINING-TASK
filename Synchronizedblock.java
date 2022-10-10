public class Synchronizedblock {
    int count = 0;
    void Increment() throws InterruptedException {
        System.out.println("I am not Synchronized "+Thread.currentThread().getName());
        synchronized (this){
            count++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
       Synchronizedblock ds = new Synchronizedblock();
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
