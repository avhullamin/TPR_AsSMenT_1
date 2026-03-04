class MyThread extends Thread {
    public void run() {
        System.out.println("Thread class running");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable interface running");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
    }
}
