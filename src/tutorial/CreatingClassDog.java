package tutorial;

// within classes we will have attribute and method 
public class CreatingClassDog {
    // 1. we will always define attribute at the top
    // attribute are what the class will have
    // eg. a dog class will have name and age
    // private keyword means the name and age attribute can only be access in the CreatingClassDog 
    // protected keyword means the name and age can be access in the same package and sub classes
    protected String name;
    protected int age;

    // 2. we will always have a constructor to initialize the object when it is
    // being instantiated
    // meaning in main.java we call CreatingClassDog John = new CreatingClassDog()
    // in this case we want the dog to have to parameter name & age
    public CreatingClassDog(String name, int age) {
        // this.name is referencing the attribute of the class
        // name referring to the argument that will be pass in
        this.name = name;
        this.age = age;
    }
    // since our age attribute is private we cannot get the age in other class 
    // getter and setters allows us to 
    public int getAge() {
        add2();
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // if we implement public final then  InheritanceFromDog cant override speak() 
    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }
    // notice that we can use add2() within CreatingClassDog
    private int add2() {
        return age + 2;
    }

}
