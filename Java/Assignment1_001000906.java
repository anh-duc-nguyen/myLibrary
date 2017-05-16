import java.util.Scanner;
/** 
 * This Program read the item name and the number (N) of cans in each pack
 * then return the price per ounce for a N-pack of item cans.
 */
public class Assignment1_001000906
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    // Read number of can in each pack
    System.out.print("Please enter amount of cans each Pack: ");
    int cansPerPack = in.nextInt();
    // Read item name
    System.out.print("Please enter the item name: ");
    String itemName = in.next();
    // Read pack price
    System.out.print("Please enter the price for a "+cansPerPack+"-pack: ");
    double packPrice = in.nextDouble();
    // Read volume of cans
    System.out.print("please enter the volume for each can(in ounce): ");
    double cansVolume = in.nextDouble();
    
    // Caculate and print out the price per ounce of item
    double packVolume = cansVolume * cansPerPack;
    double pricePerOunce = packPrice / packVolume;
    System.out.printf("Price per ounce of "+cansPerPack+"-pack "+itemName+": %8.2f", pricePerOunce);
    System.out.println();
  }
}