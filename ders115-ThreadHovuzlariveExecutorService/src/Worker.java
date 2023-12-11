
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker implements Runnable {

    private String ad;
    private int taskId;

    public Worker(String ad, int taskId) {
        this.ad = ad;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Worker " + ad + " " + taskId + " ise basladi");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Worker " + ad + " " + taskId + " isi bitirdi");

    }

}
