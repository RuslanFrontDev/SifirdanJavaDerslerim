
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
//   1. ornek

//public class ListElavesi {
//        1-den 100-e qeder ferqli sayilar yazsin deye Random yazdiq
/*
    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    public void list1DeyerElaveEt() {
        for (int i = 0; i < 2000; i++) {
      
            try {
          list1.add(i);
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void list2DeyerElaveEt() {
        for (int i = 0; i < 2000; i++) {
            list2.add(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void deyerAt() {
        list1DeyerElaveEt();
        list2DeyerElaveEt();
        System.out.println("list1 deyerlerin sayi: "+ list1.size()+ "list2 deyerlerin sayi: "+ list2.size());
    }
 */
//    ****************************************
//    2. ornek
/*  Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    public void list1DeyerElaveEt() {

        try {

            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
        }
//        0-dan 100e qeder bir dene deyer atir
        list1.add(random.nextInt());
    }

    public void list2DeyerElaveEt() {

        try {

            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
        }
//        0-dan 100e qeder bir dene deyer atir
        list2.add(random.nextInt());
    }

    public void deyerAt() {
        for (int i = 0; i < 1000; i++) {
            list1DeyerElaveEt();
            list2DeyerElaveEt();
        }
    }

    public void calisdiraq() {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deyerAt();
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deyerAt();
            }
        });
        long baslangic = System.currentTimeMillis();
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("list1 deyerlerin sayi: " + list1.size() + " list2 deyerlerin sayi: " + list2.size());
        long bitis = System.currentTimeMillis();
        System.out.println("zamaniniz: " +(bitis-baslangic));
    }
 */
//  ************************ ***********************************
//}
//  3. ornek
/*
public class ListElavesi {

    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    public synchronized void list1DeyerElaveEt() {

        try {

            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
        }
//        0-dan 100e qeder bir dene deyer atir
        list1.add(random.nextInt());
    }

    public synchronized void list2DeyerElaveEt() {

        try {

            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
        }
//        0-dan 100e qeder bir dene deyer atir
        list2.add(random.nextInt());
    }

    public void deyerAt() {
        for (int i = 0; i < 1000; i++) {
            list1DeyerElaveEt();
            list2DeyerElaveEt();
        }
    }

    public void calisdiraq() {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deyerAt();
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deyerAt();
            }
        });
        long baslangic = System.currentTimeMillis();
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("list1 deyerlerin sayi: " + list1.size() + " list2 deyerlerin sayi: " + list2.size());
        long bitis = System.currentTimeMillis();
        System.out.println("zamaniniz: " + (bitis - baslangic));
    }

}*/
// 4. ornek Lock ile
public class ListElavesi {

    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void list1DeyerElaveEt() {
        synchronized (lock1) {

            try {

                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
            }
//        0-dan 100e qeder bir dene deyer atir
            list1.add(random.nextInt());
        }
    }

    public void list2DeyerElaveEt() {
        synchronized (lock2) {
            try {

                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
            }
//        0-dan 100e qeder bir dene deyer atir
            list2.add(random.nextInt());
        }
    }

    public void deyerAt() {
        for (int i = 0; i < 1000; i++) {
            list1DeyerElaveEt();
            list2DeyerElaveEt();
        }
    }

    public void calisdiraq() {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deyerAt();
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deyerAt();
            }
        });
        long baslangic = System.currentTimeMillis();
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListElavesi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("list1 deyerlerin sayi: " + list1.size() + " list2 deyerlerin sayi: " + list2.size());
        long bitis = System.currentTimeMillis();
        System.out.println("zamaniniz: " + (bitis - baslangic));
    }

}
