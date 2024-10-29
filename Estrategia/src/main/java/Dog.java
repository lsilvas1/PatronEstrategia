public class Dog extends Animal {
    String perro;
    public Dog() {
        sound = new Bark();
    }

    @Override
    public void display() {
        perro = "Es un perro";
    }

    @Override
    public String toString() {
        return perro;
    }
}