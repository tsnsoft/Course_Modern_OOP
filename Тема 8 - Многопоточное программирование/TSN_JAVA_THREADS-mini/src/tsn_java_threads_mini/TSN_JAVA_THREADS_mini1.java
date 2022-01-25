package tsn_java_threads_mini;

class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

}

public class TSN_JAVA_THREADS_mini1 {
    public static void main(String[] args) {
        (new HelloThread()).start();
    }
}
