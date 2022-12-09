package tutorial;

// CreatingClassDog is reffered as the super/parent class
// InheritanceFromDog is refer as the sub/derive/child class
public class InheritanceFromDog extends CreatingClassDog {

    private String food;

    // 1. we must use the same constructor as CreatingClassDog
    // if not all the CreatingClassDog attrivute and method wont work
    public InheritanceFromDog(String name, int age, String food) {
        // super is referencing CreatingClassDog name and age
        super(name, age);
        this.food = food;
    }
    // overload method same name but with different parameter
    // we can have multiple constructor
    public InheritanceFromDog(String name) {
        super(name, 0);
    }

    // we can change the behaviour of speak()
    // different function as CreatingClassDog
    @Override
    public void speak() {
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
    }

    // eat() method can be used in InheritanceFromDog but not CreatingClassDog
    public void eat(String x) {
        this.food = x;
    }

}