package cn.a.cinema;

public class Cinema {
    public static void main(String[] args) {
        Sell sell = new Sell();
        Thread t1 = new Thread(sell,"售票口1");
        Thread t2 = new Thread(sell,"售票口2");
        Thread t3 = new Thread(sell,"售票口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
