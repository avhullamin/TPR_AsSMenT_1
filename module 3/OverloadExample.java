class OverloadExample {
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    void show(String s) {
        System.out.println("String: " + s);
    }
}

class OverrideBase {
    void display() {
        System.out.println("Base class display");
    }
}

class OverrideChild extends OverrideBase {
    void display() {
        System.out.println("Child class display");
    }

    public static void main(String args[]) {
        OverloadExample o = new OverloadExample();
        o.show(10);
        o.show("Hello");

        OverrideBase b = new OverrideChild();
        b.display();
    }
}
