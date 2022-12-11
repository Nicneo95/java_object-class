package tutorial;
public interface VehicleInterface {
    // any attribute in an interface have to be final 
    final int gears = 1;
    // method should be public and generic 
    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);
    // default keyword is use so it can be use from any classes that implement interface 
    default void out() {
        System.out.println("Default method");
    }
}
