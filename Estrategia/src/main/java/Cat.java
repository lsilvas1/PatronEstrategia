public class Cat extends Animal {
    String gato;

    public Cat() {
        sound = new Meow();
    }

    @Override
    public void display() {
        gato = "Es un gato";
    }

    @Override
    public String toString() {
        return gato;
    }
}