// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class bmicalculator {
   public bmicalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Welcome to the BMI Calculator!");
      System.out.print("Enter your weight in kilograms: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter your height in meters: ");
      double var4 = var1.nextDouble();
      double var6 = var2 / (var4 * var4);
      System.out.printf("Your Body Mass Index (BMI) is: %.2f\n", var6);
      if (var6 < 18.5) {
         System.out.println("You are underweight.");
      } else if (var6 >= 18.5 && var6 < 24.9) {
         System.out.println("You have a normal weight.");
      } else if (var6 >= 25.0 && var6 < 29.9) {
         System.out.println("You are overweight.");
      } else {
         System.out.println("You are obese.");
      }

      var1.close();
   }
}
