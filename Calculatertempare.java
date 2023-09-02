package Increment.calculatertemp;

import java.util.Scanner;

public class Calculatertempare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Fahrenheit to celsius (1) , celsius to Fahreheit (2)  and kelvin to celsius(3) or celsius to kelvin(4) ");
        int result = scan.nextInt();

        if (result == 1) {
            // Calculate Fahrenheit to celsiuc
            System.out.println("you have chosen Fahrenheit to celsius!");
            System.out.println("Enter Fahrenheit Value: ");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5 / 9;
            System.out.println("celsius is: ");
            System.out.println((valueFinal * 10.0) / 10.0);

        } else if (result == 2) {
            // calculate celcius to fahrenheit
            System.out.println("You have to chosen celsius to fahrenheit!");
            System.out.println("Enter Celsius value: ");
            double value2 = scan.nextDouble();
            double R = value2 * 1.8 + 32;
            System.out.println("Fahrehneit is: ");
            System.out.println((R * 10.0) / 10.0);

        } else if (result == 3) {
            // celsius to kelvin
            System.out.println("You have to chosen celsius to kelvin!");
            System.out.println("Enter celsius value: ");
            double value3 = scan.nextDouble();
            double VR = (value3 + 273.15);
            System.out.println("kelvin is: ");
            System.out.println((VR * 10.0) / 10.0);

        } else if (result == 4) {
            // kelvin to celsius
            System.out.println("You have to chosen kelvin to celsius!");
            System.out.println("Enter kelvin value: ");
            double value4 = scan.nextDouble();
            double VRf = (value4 - 273.15);
            System.out.println("celsius is: ");
            System.out.println((VRf * 10.0) / 10.0);

        } else {
            System.out.println("Envalid number");
        }

    }

}
