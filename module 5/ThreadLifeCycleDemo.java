public class ThreadLifeCycleDemo extends Thread {
    public void run() {
        System.out.println("Running");
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycleDemo t = new ThreadLifeCycleDemo();
        System.out.println("State before start: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());
        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}
