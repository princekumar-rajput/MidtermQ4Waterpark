package midtermwaterpark;

/**
 * A class that models a customer at a waterpark.
 * A customer can ride the blue slides if they are under 48 inches tall.
 * A customer can ride all slides if they are 48 inches or taller.
 * This class also contains the wristband color options as an Enum.
 * Refactored according to the given requirements.
 * @author dancye
 * @modifier Princekumar Rajput
 */
public class Customer {
    enum WristbandColor {
        BLUE, RED;
    }

    private WristbandColor wristbandColor;
    private int height;

    public Customer(WristbandColor color, int height) {
        this.wristbandColor = color;
        this.height = height;
        System.out.println("Welcome to the waterpark! You have been issued a " + color + " wristband!");
    }

    public WristbandColor getWristbandColor() {
        return wristbandColor;
    }

    public void setWristbandColor(WristbandColor color) {
        this.wristbandColor = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}