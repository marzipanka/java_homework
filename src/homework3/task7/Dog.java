package homework3.task7;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    public void fetch() {
        System.out.println("Собака приносит палку");
    }
}
