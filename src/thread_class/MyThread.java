package thread_class;


public class MyThread extends Thread {
    @Override
    public void run() {
        int counter = 0;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
