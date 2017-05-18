/** This class is for assignment 4
  * Author : Anh Nguyen Oct-14-2015
  * This class contain 3 private varible (list below)
  * user can creat an object from this class
  * and access to those varible by call function
  */

public class Ingredient{
  private String n;
  private double a;
  private String u;
  public Ingredient(String name, double amount, String unit){
    n = name;
    a = amount;
    u = unit;
  }
  public String name(){
    return n;
  }
  public double amount(){
    return a;
  }
  public String unit(){
    return u;
  }
}
