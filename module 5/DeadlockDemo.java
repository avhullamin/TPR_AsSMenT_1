public class DeadlockDemo {
    public static void main(String[] args) {
        final String r1 = "Resource1";
        final String r2 = "Resource2";

        Thread t1 = new Thread(() -> {
            synchronized(r1) {
                try { Thread.sleep(100); } catch(Exception e) {}
                synchronized(r2) { System.out.println("Thread1 done"); }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(r2) {
                try { Thread.sleep(100); } catch(Exception e) {}
                synchronized(r1) { System.out.println("Thread2 done"); }
            }
        });

        t1.start(); t2.start();
    }
}
