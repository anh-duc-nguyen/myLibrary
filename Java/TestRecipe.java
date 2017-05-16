import java.util.ArrayList;
public class TestRecipe{
  private ArrayList<String> recipeList;
  public TestRecipe(){
    ArrayList<String> recipeList = new ArrayList<String>();
  }
  public ArrayList<String> re(){
    return recipeList;
    
  }
  public void add (String ingredientName){
    recipeList.add (ingredientName);
  }
  public void has(String ingredientName){
    for (int i = 0; i < recipeList.size(); i++){
      if (ingredientName.equals(recipeList.get(i))){
        System.out.println(ingredientName);
      }
    }
  }
}
