import java.util.*;


public class DoublyLinkedList{
  private Node head;
  private Node tail;
  private int size;
  class Node{
    public Object data;
    public Node next;
    public Node prev;
  }
  public DoublyLinkedList(){
    head = new Node();
    tail = new Node();
    head.next = tail;
    tail.prev = head;
  }
  public Object getFirst(){
    if (head == null) { throw new NoSuchElementException(); }
    return head.data;
  }
  public Object getLast(){
    if (tail == null) { throw new NoSuchElementException(); }
    return tail.data;
  }
  public void add(Object element){
    Node last = tail.prev;
    Node x = new Node();
    x.data = element;
    x.next = head;
    x.prev = last;
    tail.prev = x;
    last.next = x;
    size++;
  }
  public ListIterator listIterator(){
    return new LinkedListIterator();
  }
  class LinkedListIterator implements ListIterator{
    private Node current;
    private Node lastAccessed;
    private int index;
    public boolean hasNext() {
      return index < size;
    }
    public boolean hasPrev() {
      return index > 0;
    }
    /**
     * Constructs an iterator that points to the front of the
     * linked list.
     */
    public LinkedListIterator(){
      current = head.next;
      lastAccessed = null;
      index = 0;
    }
    public Object next(){
      if (!hasNext()) { throw new NoSuchElementException(); }
      lastAccessed = current;
      Object item = current.data;
      current = current.next;
      index++;
      return item;
    }
    public Object prev(){
      if (!hasPrev()) { throw new NoSuchElementException(); }
      current = current.prev;
      index--;
      lastAccessed = current;
      return current.data;
    }
    public void add(Object element){
      Node x = current;
      Node y = new Node();
      Node z = current;
      y.data = element;
      x.next = y;
      y.next = z;
      z.prev = y;
      y.prev = x;
      size++;
      index++;
    }
    public void remove(){
      if (lastAccessed ==null) {throw new IllegalStateException();}
      Node x= lastAccessed.prev;
      Node y = lastAccessed.next;
      x.next = y;
      y.prev = x;
      size--;
      if(current == lastAccessed){
        current = y;
      }else{
        index--;
      }
      lastAccessed = null;
    }
    public void set(Object element){
      if (lastAccessed ==null) {throw new IllegalStateException();}
      current.data = element;
    }
  }
  public interface ListIterator{
    Object next();
    Object prev();
    boolean hasNext();
    boolean hasPrev();
    void add(Object element);
    void remove();
  }
  public void printData(){
    System.out.println("printing data");
    Node tmp = head;
    while(tmp.next != tail){
      tmp = tmp.next;
      System.out.println(tmp.data);
    }
  }
}


      
    
    
  