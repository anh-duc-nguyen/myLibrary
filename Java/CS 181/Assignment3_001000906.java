/*
 * This is CashRegister class
 * Accept an array of integer prices 
 */
public class Assignment3_001000906{
  private int storedMoney;
  public Assignment3_001000906(){
    storedMoney = 0;
  }
  public void processSale(int [] prices){
    for (int i = 0; i < prices.length; i++){
      // run through each value in the input array 
      if (prices[i] >0){
        // add it to the storedMoney if it a valid value
        storedMoney = storedMoney + prices[i];
        // print out the valid value
        System.out.println(prices[i]);
      }else
        // print out -1 if the value is invalid
        System.out.println(-1);

    }
  }
  
  public void processReturn(int [] prices){
    for (int i = 0; i < prices.length; i++){
      // run through each value in the input array
      if (prices[i] < storedMoney && prices[i] >0){
        // subtract it to the storedMoney if it a valid value
        storedMoney = storedMoney - prices[i];
        System.out.println(prices[i]);
      }else
        // print out -1 if the value is invalid or greater than
        // the storedMoney
        System.out.println(-1);
    }
  }
  
  public int viewBalance(){
    // return sotedMoney
    return storedMoney;
  }
}