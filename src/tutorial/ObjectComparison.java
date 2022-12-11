package tutorial;
public class ObjectComparison {
    public static void main(String[] args) {
        // in memory object joe != object joe
        Student joe = new Student("joe");
        Student bill = new Student("joe");
        Student tim = new Student("tim");

        // System.out.println(bill == joe);

        System.out.println(joe.equals(bill));
        // comparing their first character how many char apart
        System.out.println(joe.compareTo(tim));
        System.out.println(joe.compareTo(bill) > 0);
        // when we print object like this is return Student@7344699f 
        // we need to create a method
        System.out.println(tim);


    
    }
}
