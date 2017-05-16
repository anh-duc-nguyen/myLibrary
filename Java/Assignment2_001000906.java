import java.util.Scanner;
/**
 * This program read in two DNA sequences and determines whether they are 
 * or are not reverse complements of each other
 */
public class Assignment2_001000906{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the first sequence  : ");
    String firstSequence = in.nextLine();    //Read in first sequence
    System.out.print("Please enter the second sequence : ");
    String secondSequence = in.nextLine();   //Read in second sequence
    if (isReverseComplement(firstSequence,secondSequence)) // using isReverseComplement method
      System.out.println("These are reverse complements");
    else
      System.out.println("These are not reverse complements");
  }
  public static boolean isReverseComplement(String firstSequence,String secondSequence){
    /**
     * This method read in 2 string of DNA sequences and return boolean value 
     * indicating wheter those sequences are reverse complements of each other
     */
    String reverseFirstSequence = new StringBuilder(firstSequence).reverse().toString(); // reverse the first sequence
    String subString1 = reverseFirstSequence.replace("A","t"); // Substitute A with t
    String subString2 = subString1.replace("T","A");           // Substitute T with A
    String subString3 = subString2.replace("t","T");           // Substitute t with T
    String subString4 = subString3.replace("C","g");           // Substitute C with g
    String subString5 = subString4.replace("G","C");           // Substitute G with C
    String subString6 = subString5.replace("g","G");           // Substitute g with G
    if (subString6.equals(secondSequence)){
      return true;
    }
    return false;
  }
  
}