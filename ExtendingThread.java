
class ParentThread extends Thread{
    int i;
    public void run(){
        System.out.println("Parent Thread"+"-"+Thread.currentThread().getName());
    }
}
class ChildThread extends Thread{
    int i;
    public void run(){
        System.out.println("Child Thread"+ "-"+Thread.currentThread().getName());
    }
}
class ExtendingThread{
    public static void main(String[] args) {
        ParentThread obj1 = new ParentThread();
        ChildThread  obj2 = new ChildThread();

        obj1.setName("ParentThread");
        obj2.setName("ChildThread");

        obj1.start();
        obj2.start();

    }
}