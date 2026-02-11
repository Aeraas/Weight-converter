
import java.util.Scanner;

public class weightConversion
{
    public static void main(String [] args)
    {
        //WEIGHT CONVERSION PROGRAM LESSON 15

        Scanner UserInput = new Scanner(System.in);

        //declare variables
        double weight;
        double newWeight;
        int option;

        //welcome message
        System.out.println("WEIGHT CONVERSION PROGRAM: ");
        System.out.println("Option 1: convert lbs to kg");
        System.out.println("Option 2: convert kg to lbs");

        //prompt for user input
        System.out.print("Choose an option: ");
        option = UserInput.nextInt();

        //option1 from lbs to kg
        if(option == 1)
        {
            System.out.print("Enter the weight in lbs: ");
            weight = UserInput.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("\n The new weight in kgs is: %.2f ", newWeight);
        }
        //option2 from kg to lbs
        else if (option == 2)
        {
            System.out.print("Enter the weight in kgs: ");
            weight = UserInput.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("\n The new weight in lbs is: %.2f", newWeight);
        }
        //else print not a valid choice
        else
        {
            System.out.println("Not a valid option choice");
        }

        UserInput.close();
    }
}
