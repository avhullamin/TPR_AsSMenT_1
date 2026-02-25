class Student {
    String name;
    int age;

    Student() {
        name = "Alex";
        age = 23;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Bob", 21);

        s1.display();
        s2.display();
    }
}
