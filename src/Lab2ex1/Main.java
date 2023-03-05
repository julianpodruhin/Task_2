package Lab2ex1;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner (System.in);
        String opr = "";
        System.out.println("Select your operator which you want to perform:");
        System.out.println("Press 1 For Addition");
        System.out.println("Press 2 For Substract");
        System.out.println("Press 3 For Multyplication");
        System.out.println("Press 4 For Division");
        System.out.println("Your selection is: ");
        opr = sc.next();

    }
}
