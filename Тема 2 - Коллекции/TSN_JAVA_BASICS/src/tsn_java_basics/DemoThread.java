package tsn_java_basics;

class MyThreadExtends extends Thread {

    @Override
    public void run() {
        boolean stop = false;
        while (!stop) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                stop = true;
            }
        }
    }
}

class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        boolean stop = false;
        while (!stop) {
            System.out.print("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                stop = true;
            }
        }
    }
}

public class DemoThread {

    public Thread newThread() {
        Thread thread = (new Thread(new Runnable() {
            @Override
            public void run() {
                boolean stop = false;
                while (!stop) {
                    System.out.print("!");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        stop = true;
                    }
                }
            }
        }));
        return thread;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.print("start ");

        MyThreadExtends myThread1 = new MyThreadExtends();
        Thread myThread2 = new Thread(new MyThreadRunnable());
        Thread myThread = new DemoThread().newThread();

        myThread.start();
        myThread1.start();
        myThread2.start();

        Thread.sleep(2000);

        myThread2.interrupt();
        myThread1.interrupt();
        myThread.interrupt();

        System.out.println(" end");
    }

}
