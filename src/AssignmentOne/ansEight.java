package AssignmentOne;

import java.util.Scanner;

public class ansEight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("\nInput height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " units.");
    }
}

