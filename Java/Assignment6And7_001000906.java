import java.util.*;
import java.io.*;
public class Assignment6And7_001000906{
  public static void main(String[] args){
    /* This function creat a linked list from class DoublyLinkedList
     * from path to input file.
     * Combine 2 Node of the LinkedList and add then to the middle
     * print out the LinkedList
     */
    DoublyLinkedList list = new DoublyLinkedList();
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter Patch to .txt file: ");
    String fileName = in.nextLine();
    String line = null;
    try {
            FileReader fileReader = 
                new FileReader(fileName);
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
              list.add(line);
            }
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }
  list.printData();
  DoublyLinkedList.ListIterator iterator1 = list.listIterator();
  DoublyLinkedList.ListIterator iterator2 = list.listIterator();
  iterator1.next();
  iterator2.next();
  while (iterator1.hasNext()){
    String x = iterator1.next().toString();
    String[] part1 = x.split(",");
    iterator1.next();
    String[] part2 = x.split(",");
    String a = part1[0] + part2[0];
    int b = Integer.valueOf(part1[1]) - Integer.valueOf(part2[1]);
    String data = a +"," + Integer.toString(b);
    iterator2.next();
    iterator2.add(data);
    iterator2.next();
  }
  list.printData();
  }
}


          

  



  