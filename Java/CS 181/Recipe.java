/** This class is for assignment 4
  * Author : Anh Nguyen Oct-14-2015
  *  This class contain object private name and
  *  ArrayList of oject form class Ingredient
  *  You can add Ingredient to the ArrayList
  *  Check weather the Ingredient is in the Recipe or not,
  * then print out the name of the Recipe
  */

import java.util.ArrayList;
public class Recipe{
  private String n;
  private ArrayList<Ingredient> ingredientList;
  public Recipe(String name){
    // Creating new Recipe object
    n = name;
    ingredientList = new ArrayList<Ingredient>();
  }
  public void add (Ingredient ingredientName){
    // add an Ingredient to the ArrayList
    ingredientList.add (ingredientName);
  }
  public boolean has(String ingredientName){
    for (int i = 0; i < ingredientList.size(); i++){
      // run thought each ingredient in the ArrayList
      if (ingredientName.equals(ingredientList.get(i).name())){
        // check the name of the ingredient with the input ingredientName
        System.out.println(n);
        // print out the recipe name if the ingredietn in the recipe
        return true;
      }else{
        System.out.println('-');
        // print out the '-' if the ingredient not in the recipe
        return false;
      }
    }return false;
  }
}
