package main.java.exam.ocp;class HelloAnimal {    void hello(Speakable animal) {        animal.speak();    }    public static void main(String[] args) {        HelloAnimal helloAnimal = new HelloAnimal();        Animal dog = new Dog();        Animal cat = new Cat();        helloAnimal.hello((Speakable) dog);        helloAnimal.hello((Speakable) cat);    }}