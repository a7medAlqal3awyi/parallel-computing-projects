package thread_class;

import thread_class.MyThread;

public class main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
         myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
