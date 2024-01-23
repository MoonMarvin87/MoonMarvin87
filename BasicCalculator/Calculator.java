import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class Calculator{
    public static void main(String[] args){
        
        // set nums
        double num1;
        double num2;
        char operator;

        // ask for numbers
        Scanner input  = new Scanner(System.in);
        System.out.println("Give Me A Number" );
        
        // take numbers in
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        //ask for operator
        System.out.println("Give Me A Operator");
        operator = input.nextChar();
        //return nums output to user


    }   

   public static double add(double num1,double num2){
        if(operator = "+"){
            return num1 + num2;
        }
    }
}
