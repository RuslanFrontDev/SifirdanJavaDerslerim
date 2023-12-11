
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
/*
    console-da th2-th3 de gözləyə bilər və ya th-1th2-th3-th4-th5 də eyni anda gözləyə bilər.
    bu bizi çaşdırmasın. dərsin əvvəlində də dediyimiz kimi thread özü zamanlayır, və hansının
    birinci gəlməyini və ya gözləməyini özü seçir
    */
    public static void main(String[] args) {
        Semaphore semafor = new Semaphore(4, true);

        // Thread'leri yarat
        Thread thread1 = new Thread(new IsParcasi(semafor, "Thread-1"));
        Thread thread2 = new Thread(new IsParcasi(semafor, "Thread-2"));
        Thread thread3 = new Thread(new IsParcasi(semafor, "Thread-3"));
        Thread thread4 = new Thread(new IsParcasi(semafor, "Thread-4"));
        Thread thread5 = new Thread(new IsParcasi(semafor, "Thread-5"));

        // Thread'leri başlat
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class IsParcasi implements Runnable {

    private final Semaphore semafor;
    private final String ad;

    public IsParcasi(Semaphore semafor, String ad) {
        this.semafor = semafor;
        this.ad = ad;
    }

    @Override
    public void run() {
        try {
            System.out.println(ad + " gozleyir.");
            semafor.acquire(); // Semafordan icaze al
            System.out.println(ad + " içeri girdi.");

            // Burada kritik bölgeye aid işlemleri ede bilerik.
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(ad + " cixir.");
            semafor.release(); // Semafordan icazeni serbest burax
        }
    }
}
