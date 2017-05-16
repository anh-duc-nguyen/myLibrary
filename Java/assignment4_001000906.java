import java.util.ArrayList;
import java.util.Scanner;
/** This program input recipe and ingredient from the user
 * Then help looking for recipe that contain the ingredient
 * that user looking for
 */ 
public class assignment4_001000906{
  public static void main(String[] args){
    String recipeName ="";
    String searchIngredient ="";
    String ingredientName = "";
    ArrayList<Recipe> recipeList = new ArrayList<Recipe>(); // Create an ArrayList of Recipe
    Scanner in = new Scanner(System.in);
    while (true){
      in = new Scanner(System.in);
      System.out.print("Input recipe name ('none' to stop): ");
      recipeName = in.nextLine();
      if (recipeName.equals("none")){
        break;          // break the while loop when user input "none"
      }
      Recipe reci = new Recipe(recipeName); // creat new recipe (reci) from user input
      while (true){
        in = new Scanner(System.in);
        System.out.print("Input ingredient name ('none' to stop): ");
        ingredientName = in.nextLine();
        if (ingredientName.equals("none")){
          break;        // break the while loop when user input "none"
        } 
        in = new Scanner(System.in);
        System.out.print("Input the ingredient amount: ");
        double amount = in.nextDouble();
        in = new Scanner(System.in);
        System.out.print("Input the ingredient unit: ");
        String unit = in.nextLine();
        Ingredient ingred = new Ingredient(ingredientName,amount,unit); 
        // creat new ingredient (ingred) from user input
        reci.add(ingred); // then add it to the recipe (reci)
      }
      recipeList.add( reci ); // add the recipe to the recipeList
    }
    System.out.println("=======================================");
    // Start looking for recipes using ingredients
    while (true){
      System.out.println("-------------------------------------");
      in = new Scanner(System.in);
      System.out.print("Input ingredient list ('done' to stop): ");
      ingredientName = in.nextLine();
      if (ingredientName.equals("done")){
        break;           // break the while loop when user input "done"
      }
      int recipeFound = 0;
      for (int i = 0; i < recipeList.size(); i++){
        // run throught each recipe in recipeList
        if (recipeList.get(i).has(ingredientName)){
          // check whether the ingredient is in the recipe or not
          recipeFound++;
        }
      }
      System.out.println ( recipeFound + " recipe(s) found)");
      // print out number of recipe found
    }
  }
}  