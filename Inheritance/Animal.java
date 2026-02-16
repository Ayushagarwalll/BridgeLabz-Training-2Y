class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Chirp");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog("Max", 3);
        Animal a2 = new Cat("Luna", 2);
        Animal a3 = new Bird("Kiwi", 1);
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}