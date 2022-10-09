
class MainThreadDemo extends Thread{
    int i;
    public void run(){
        for (i=1;i<=10 ;i++ ) {
            System.out.println(i);
        }

    }
}
class ChildThreadDemo extends Thread{
    int i;
    public void run(){
        for (i=1;i<=10 ;i++ ) {
            System.out.println(i);
        }

    }
}
class ThreadDemo{
    public static void main(String[] args) throws InterruptedException {
        MainThreadDemo obj1 = new MainThreadDemo();
        ChildThreadDemo  obj2 = new ChildThreadDemo ();



        obj1.start();
        obj1.join();
        obj2.start();

    }
}