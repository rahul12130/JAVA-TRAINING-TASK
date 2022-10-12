class OE {
    int n=10;

    void allnumber() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public synchronized void odd() throws InterruptedException {
            for (int i = 0; i <=n; i++) {
                if (i % 2 != 0) {
                    Thread.sleep(100);
                    System.out.println("odd: " + i);
                    System.out.println("Name odd Thread: "+Thread.currentThread().getName());
                    wait();
                } else {
                    notifyAll();

                }
            }
        }

    public synchronized void even() throws InterruptedException {

            for (int i = 0; i <=n; i++) {
                if (i % 2 == 0) {
                    Thread.sleep(100);
                    System.out.println("even: " + i);
                    System.out.println("Name even Thread: "+Thread.currentThread().getName());
                    wait();
                } else {
                    notifyAll();

                }
            }

        }
}



public class oddeven {

    public static void main(String[] args) {
        OE obj1 = new OE();
        class T1 extends Thread {
            public void run() {
                try {
                    obj1.odd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        //obj1.allnumber();
        class T2 extends Thread {
            public void run() {
                try {
                    obj1.even();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        T2 t2 = new T2();
        t2.start();
        T1 t1= new T1();
        t1.start();
    }
}