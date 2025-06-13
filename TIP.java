class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    Dog() {
        super("");
    } // Provide default constructor

    @Override
    void printName() {
        super.printName();
        System.out.println("Dog name: " + name);
    }
}

public class TIP {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.printName();
    }
}
