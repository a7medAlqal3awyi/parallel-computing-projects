package runnable_class;

public class main {
  public static void main(String[] args){
      MyRunnableThread instant= new MyRunnableThread();

      Thread th1= new Thread(instant);
      th1.start();
      Thread th2= new Thread(instant);
      th2.start();
  }
}
