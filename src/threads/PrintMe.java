package threads;

public class PrintMe implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("numero " + i + " - " + Thread.currentThread().getName());
            }
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Esto es un error");
        }
    }
}
