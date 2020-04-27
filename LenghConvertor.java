package org.example;
import java.util.Scanner;

public class LenghConvertor  {

    public static void main (String[] args) {
        float to,from;
        System.out.println("Enter Length in kilometer:");
        Scanner input = new Scanner(System.in);
        from = input.nextFloat();
        to = from*1000000;
        System.out.println("Length in millimeter = "+to);

        System.out.println("Enter Length in meter:");
        from = input.nextFloat();
        to = from*1000;
        System.out.println("Length in millimeter = "+to);

        System.out.println("Enter Length in decimeter:");
        from = input.nextFloat();
        to = from*100;
        System.out.println("Length in millimeter = "+to);

        System.out.println("Enter Length in centimeter:");
        from = input.nextFloat();
        to = from*110;
        System.out.println("Length in millimeter = "+to);
    }

}
