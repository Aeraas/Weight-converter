import java.util.Scanner;

public class WeightConverter 
{

    //the variables needed to 
    private static final double LBSToKg = 0.45359237;
    private static final double KGToLbs = 2.20462262;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        printWelcomeMessage();

        //if its running the program is actually running
        while (running) 
        {
            //shows the cjoices
            printMenu();
            int option = getMenuChoice(scanner);

            //switch instead of if just cleaner
            switch (option) 
            {
                case 1:
                    convertPoundsToKilograms(scanner);
                    break;
                case 2:
                    convertKilogramsToPounds(scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Thanks for using the Weight Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printWelcomeMessage() 
    {
        System.out.println("---------------------------------");
        System.out.println("      WEIGHT CONVERTER APP       ");
        System.out.println("---------------------------------"); 
        System.out.println("Convert between pounds and kilograms");
        System.out.println();
    }

    private static void printMenu() 
    {
        System.out.println("Menu:");
        System.out.println("1. Convert pounds (lbs) to kilograms (kg)");
        System.out.println("2. Convert kilograms (kg) to pounds (lbs)");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    private static int getMenuChoice(Scanner scanner) 
    {
        while (!scanner.hasNextInt()) 
        {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double getWeightInput(Scanner scanner, String unit) 
    {
        double weight;

        while (true) 
        {
            System.out.print("Enter weight in " + unit + ": ");

            while (!scanner.hasNextDouble()) 
            {
                System.out.print("Invalid input. Enter a numeric value: ");
                scanner.next();
            }

            weight = scanner.nextDouble();

            if (weight >= 0) {
                return weight;
            }

            System.out.println("Weight cannot be negative. Try again.");
        }
    }

    private static void convertPoundsToKilograms(Scanner scanner) 
    {
        double pounds = getWeightInput(scanner, "lbs");
        double kilograms = pounds * LBSToKg;

        System.out.printf("%.2f lbs = %.2f kg%n", pounds, kilograms);
    }

    private static void convertKilogramsToPounds(Scanner scanner) {
        double kilograms = getWeightInput(scanner, "kg");
        double pounds = kilograms * KGToLbs;

        System.out.printf("%.2f kg = %.2f lbs%n", kilograms, pounds);
    }
}