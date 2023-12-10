package synchronize;


public class main {
    public static void main(String[] args) {

        MySchro mySynchronized1 = new MySchro();
        mySynchronized1.start();

        MySchro mySynchronized2 = new MySchro();
        mySynchronized2.start();

        MySchro mySynchronized3 = new MySchro();
        mySynchronized3.start();

    }
}
