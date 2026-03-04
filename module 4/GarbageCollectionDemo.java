class Demo {
    protected void finalize() {
        System.out.println("Garbage Collector called, object deleted");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1 = null;
        d2 = null;

        System.gc();
    }
}
