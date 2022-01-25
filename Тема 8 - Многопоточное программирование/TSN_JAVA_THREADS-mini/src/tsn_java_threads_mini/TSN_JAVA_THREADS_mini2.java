package tsn_java_threads_mini;

class SomeThing implements Runnable {

    @Override
    public void run() {
        System.out.println("Привет из побочного потока!");
    }
}

public class TSN_JAVA_THREADS_mini2 {

    static SomeThing sth;

    public static void main(String[] args) {
        sth = new SomeThing();
        Thread t = new Thread(sth);
        t.start();
        System.out.println("Главный поток завершён...");
    }
}
