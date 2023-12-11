package static_synchronized;

class MyStaticSychnorized {
    static synchronized void view(int n) {
        System.out.println("the program start here\n");
        for (int i = 1; i < 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        MyStaticSychnorized.view(1);
    }
}

class MyThread2 extends Thread {
    public void run() {
        MyStaticSychnorized.view(10);
    }
}

class MyThread3 extends Thread {
    public void run() {
        MyStaticSychnorized.view(100);
    }
}

class MyThread4 extends Thread {
    public void run() {
        MyStaticSychnorized.view(1000);
    }
}
class Main{
    public static void main(String[] args){
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}