package org.example;
import java.util.Scanner;

public class LenghtCalculator   {

    public static void main(String args[]){
        Scanner convertor = new Scanner(System.in);
        System.out.println("Enter firs number: ");
        float num1 = convertor.nextFloat();

        System.out.println("Enter second number: ");
        float num2 = convertor.nextFloat();

        System.out.println("Enter third number: ");
        float num3 = convertor.nextFloat();

        System.out.println("Enter fourth number: ");
        float num4 = convertor.nextFloat();

        System.out.println("Enter the operation you want tot perform: ");
        char operation = convertor.next().charAt(0);
        convertor.close();

        if(operation == '+'){
            System.out.println(num1 + num2 + num3 + num4);
        }
        if(operation == '-'){
            System.out.println(num1 - num2 - num3 - num4);
        }
    }

}

