package midtermwaterpark;

import java.util.Scanner;

/**
 * A class that models a waterpark wristband system
 * Note that the full functionality is not completed.
 * Please focus on the design and not the functionality for the midterm
 * Refactored to store the possible wristband colors in an Enum.
 * Refactored UI code into a single class for better encapsulation.
 * Refactored according to the given requirements.
 * @author dancye'
 * @modifier Princekumar Rajput
 */
public class MidtermWaterPark {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the waterpark, please enter some details to get a wrist band");
        System.out.print("Please enter your height in inches: ");
        int height = sc.nextInt();

        if (height < 48) {
            Customer customer = new Customer(Customer.WristbandColor.BLUE, height);
        } else {
            Customer customer = new Customer(Customer.WristbandColor.RED, height);
        }
    }
}
