package threads;

public class PrintMe implements Runnable {

    @Override
    public void run() {
        for (short i = 0; i<10; i++){
            System.out.println("numero " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
