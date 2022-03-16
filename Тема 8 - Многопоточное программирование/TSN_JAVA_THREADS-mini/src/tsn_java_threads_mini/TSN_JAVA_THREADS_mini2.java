package tsn_java_threads_mini;

import static tsn_java_threads_mini.TSN_JAVA_THREADS_mini2.C;
import static tsn_java_threads_mini.TSN_JAVA_THREADS_mini2.R;
import static tsn_java_threads_mini.TSN_JAVA_THREADS_mini2.m;

class SomeThing implements Runnable {

    @Override
    public void run() {
        System.out.println("Привет из побочного потока!");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class TSN_JAVA_THREADS_mini2 {

    static SomeThing sth;

    static final int R = 4;
    static final int C = 5;
    static int m[][] = new int[R][C];

    public static void main(String[] args) {
        sth = new SomeThing();
        Thread t = new Thread(sth);
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                m[i][j] = (int) Math.round(Math.random() * 9);
            }
        }
        t.start();
        System.out.println("Главный поток завершён...");
    }
}
