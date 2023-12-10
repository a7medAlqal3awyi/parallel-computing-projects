package synchronize;

public class MySchro extends Thread {

    public void run() {
        display();
    }

    synchronized static void display() {
        int x = 0;
        System.out.println("program start here \n");
        while (x < 10) {
            System.out.println(x);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
