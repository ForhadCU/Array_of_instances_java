import java.util.ArrayList;
import java.util.Scanner;

public class CarnivalMain {
    private static Scanner scanner;

    public static void main(String[] args) {
        // question: 2
        Carnival carnival = new Carnival(); // Create instance of Carnival class
        scanner = new Scanner(System.in);
        int guestsNum;

        System.out.println("\nEnter the number of guests");
        guestsNum = scanner.nextInt();

        // set Guests number
        carnival.setNumOfGuests(guestsNum);

        // display Guests number
        System.out.println("\nDisplay the Number of guests: " + carnival.getNumOfGuests());

        // display Greeting message
        carnival.displayGreetingMsg();

        // quetion 2.3
        CarnivalMeal carnivalMeal = new CarnivalMeal();
        ArrayList<String> inputMealNames = new ArrayList<>();
        ArrayList<String> outputMealNames = new ArrayList<>();
        int numOfMeals;
        String name;

        System.out.println("\n\nEnter the number of meals: ");
        numOfMeals = scanner.nextInt();

        //input meal names
        for (int i = 0; i < numOfMeals; i++) {
            name = scanner.next();
            inputMealNames.add(name);
        }
        carnivalMeal.setMealNames(inputMealNames);

        //get and display meal names
        System.out.println("\nList of the meal names: ");
        outputMealNames = carnivalMeal.getMealNames();
        for (int i = 0; i < outputMealNames.size(); i++) {
            System.out.println(outputMealNames.get(i));
        }
    }
}
