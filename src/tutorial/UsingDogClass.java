package tutorial;

public class UsingDogClass {

    public static void main(String [] args) {
        // the instance was name john
        // john store name = BOBO age = 4 
        CreatingClassDog john = new CreatingClassDog("BOBO", 4);
        // when we call john.speak() the name will be reference BOBO and age 4
        john.speak();
        CreatingClassDog alex = new CreatingClassDog("Yuri", 5);
        CreatingClassDog janice = new CreatingClassDog("KOKO", 6);
        CreatingClassDog alicia = new CreatingClassDog("DODO", 7);
        // notice that with classes we can store many value to our name and age attribute 
        alex.speak();
        janice.speak();
        alicia.speak();
        // setAge() to change the age of the dog
        alicia.setAge(10);
        alicia.speak();
        // we can't use add2() method in here because it is private
        // add2();
        // two different constructor we created in InheritanceFromDog
        InheritanceFromDog kimmy = new InheritanceFromDog("Ruko");
        kimmy.speak();
        InheritanceFromDog amanda = new InheritanceFromDog("jojo",8,"milk");
        amanda.speak();
    }
}
