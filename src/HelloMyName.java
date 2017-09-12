//hello my name project, syed eliyas bin feisal muhammad abdul rauf 6962157 csc 200
import java.util.Scanner;
public class HelloMyName {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String name = input.next();
        System.out.println("Please enter your password.");
        int password = input.nextInt();
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        System.out.println("Are you male or female?");
        String genderOut = input.next();
        if (genderOut.equals("male")) // to print out mr
        {System.out.println( "Hello Mr " + name + ". Welcome to CSC 200 class. You are " + age + " years old. Your password is " + password);}
        else if (genderOut.equals("female")) // to print out ms
        {System.out.println( "Hello Ms " +  name + ". Welcome to CSC 200 class. You are " + age + " years old. Your password is " + password );}
        else //if other
        {System.out.println( "Hello " + name + ". Welcome to CSC 200 class. You are " + age + " years old. Your password is " + password );}

        //System.out.println("Hello " + " " + suffix + name + ". You are " + age + " years old.");

    }
}
