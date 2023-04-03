import java.util.Scanner;

public class Product {
    Scanner sc = new Scanner(System.in);

    String firstName;
    String lastName;
    int age;
    char sex;
    
    // CONSTRUCTOR
    Product(String firstName, int age , String lastName ){
       this.firstName = firstName;
       this.age = age;
       this.lastName = lastName;
    //    this.sex = sex;

       System.out.println("Your First name is " + firstName);
       System.out.println("Your Last Name in " + lastName);
       System.out.println("Your age is " + age);
    }


}
