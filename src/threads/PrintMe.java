package threads;

public class PrintMe implements Runnable {

    @Override
    public void run() {
        for (short i = 1; i<=10; i++){
            System.out.println("numero " + i);
            System.out.println( Thread.currentThread() );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }


    }
}
