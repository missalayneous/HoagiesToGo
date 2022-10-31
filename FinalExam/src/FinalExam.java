import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {

        //Declare a variable to hold the slogan
        String slogan = "Build Your Own Hoagies, Your Way. " +
                "\n\nTime to build a hoagie!";

        //Declare boolean variable to track if the hoagie is vegan or not
        boolean isVegan;

        //Declare three arraylists to hold the rolls, meats, and toppings.
        ArrayList<String> rolls = new ArrayList<String>();
        ArrayList<String> meats = new ArrayList<String>();
        ArrayList<String> toppings = new ArrayList<String>();

        //Add the values to the arraylists
        rolls.add("White");
        rolls.add("Wheat");
        rolls.add("Sesame");

        meats.add("Ham");
        meats.add("Chicken");
        meats.add("Veggie");

        toppings.add("Cheese");
        toppings.add("Lettuce");
        toppings.add("Tomatoes");
        toppings.add("Onions");
        toppings.add("Bacon");
        toppings.add("Mayo");

        //--------------------------------------------------------------------------------------------

        System.out.println("\nWelcome to HTG or Hoagies, TO GO!");
        System.out.println(slogan);

        System.out.println("\nLet's get started with your roll!" +
                "\nThe types we have are:");
        displayIngredients(rolls);

        System.out.println("Which roll would you like?");

        //Get the type of roll as input from the user
        Scanner input = new Scanner(System.in);
        String userRoll = input.next();

        System.out.println("Great Choice!");
        System.out.println("Next, you'll choose your hoagie filling!" +
                "\nWe have:");
        displayIngredients(meats);

        System.out.println("Which filling would you like?");

        //Get the type of meat/filling as input from the user
        String userMeat = input.next();

        //Determine if the selected meat/filling is Vegan
        if(userMeat.equalsIgnoreCase("ham") || userMeat.equalsIgnoreCase("bacon")){
            isVegan = false;
        }else{
            isVegan = true;
        }//end if

        //Create an arraylist to hold the customers toppings
        ArrayList<String> userToppings = new ArrayList<String>();

        System.out.println("Finally, let's choose our toppings." +
                "\nPick as many as you like!");



        //declare a variable so that the while loop runs at least once
        boolean wantsMoreToppings = true;

        //Use a while loop to keep prompting the user to
        //choose toppings until they are finished
        while(wantsMoreToppings){

            //Display toppings to the user and prompt the user to choose a topping
            displayIngredients(toppings);
            System.out.println("What type of topping do you want?");

            //Get the topping from the user and add it to the customers list of toppings
            String userTopping = input.next();
            userToppings.add(userTopping);

            //Determine if the selected topping is Vegan
            if(userTopping.equalsIgnoreCase("cheese") || userTopping.equalsIgnoreCase("bacon") || userTopping.equalsIgnoreCase("mayo")){
                isVegan = false;
            }//end if

            //Ask the user if they want another topping
            System.out.println("Do you want to add another topping to your hoagie? [Yes or No]");

            //If the user answers Yes, stop looping, else keep going
            String userResponse = input.next();

            if(userResponse.equalsIgnoreCase("yes")){
                wantsMoreToppings = true;
            } else {
                wantsMoreToppings = false;
            }//end if statement
        }//end while loop

        //Display a message to the user showing the type of hoagie they ordered
        System.out.print("---------------------------------------------------------------------");
        System.out.println("\nYou ordered a " + userMeat + " hoagie on a " + userRoll + " roll.");

            //Print a message displaying the users toppings for the hoagie
            System.out.println("Your hoagie is topped with: ");
            for (String topping : userToppings) {
                System.out.print(topping + " ");
            }//end for each

        //If the hoagie is Vegan, display a message indicating as much, otherwise thank them for the order
        if(isVegan){
            System.out.println("\n*Thank You for trying our Vegan Hoagie!*");
        } else {
            System.out.println("\nThank you for ordering a hoagie from Hoagies TO GO!");
        }//end if

    }//end main

    //Method to display the hoagie ingredients to the customer
    private static void displayIngredients(ArrayList<String> ingredients){

        //Use a loop to iterate over the items in the ArrayList and display them to the customer
        for(String ingredient : ingredients){
            System.out.print(ingredient + "\n");
        }//end for each loop
    }//end method displayIngredients

}//end class


