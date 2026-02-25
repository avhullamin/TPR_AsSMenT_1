public class Animal {
     void sound(){
        System.out.println("Depends on the species");
    }
    void food(){
        System.out.println("Both herbivore and Carnivore ");
    }
    void habitat(){
        System.out.println("On land");
    }
}
class Dog extends Animal{

     void sound(){
        System.out.println("Woof");
    }
    void food(){
        System.out.println("Carnivore ");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a= new Animal();
        Dog d= new Dog();
        d.food();
        a.food();
        a.sound();
        d.sound();
        d.habitat();
    }
}