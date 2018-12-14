public class MyLinkedList{
  private class Node{
    private Integer data;
    private Node next,prev;

    Node next()
    Node prev()
    void setNext(Node other)
    void setPrev(Node other)
    Integer getData()
    Integer setData(Integer i)
    String toString()
  }

  private int length;
  private Node start,end;

  MyLinkedList() 

  public int size() {
    return length;
  }

  public boolean add(Integer value) {

  }

  public String toString() {

  }

  
  Integer get(int index)  
  Integer set(int index,Integer value)

  boolean contains(Integer value)
  int indexOf(Integer value)

  void add(int index,Integer value) 
  Integer remove(int index) 
  boolean remove(Integer value) //indexOf() would also be useful
}
