package tutorial;

public class UsingInterface {
    public static void main(String[] args) {
        ImplementInterface ford = new ImplementInterface();

        ford.speedUp(30);
        ford.changeGear(2);
        ford.display();
    }
}
