package tutorial;

import java.util.Scanner;

public class IntroToObject {
    // method are anything thats are inside a class
    public static void main(String[] args) {
        // sc is equal to a new Scanner object that takes in an argument from System.in
        Scanner sc = new Scanner(System.in);
        // sc.next();
        // x is equal to and int object with the value 5
        int x = 5;
        // we can't invoke .next() because .next() belongs to Scanner class
        // method/function
        // x.next();
        // str is a String object with the value "hello"
        String str = "hello";
        // "Have a nice day", 4 are the argument pass in to tim()
        tim("Have a nice day", 4);
        System.out.println(add2(6));
    }

    // void - not returning any data type
    // tim() - is the name of the method
    // String a, int x are the parameter tim() required
    public static void tim(String a, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(a);
        }
    }
    // this method return an int 
    // the argument take in will + 2 
    public static int add2(int x) {
        return x + 2; 
    }
}