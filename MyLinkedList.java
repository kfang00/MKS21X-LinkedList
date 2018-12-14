import java.util.List;

public class MyLinkedList{
  private class Node{
    private Integer data;
    private Node next,prev;
    
    public Node() {
	data = new Integer();        
	next = new Node();
	prev = new Node();
    }

    public Node next() {
    	return next;
    }

    public Node prev() {
	return prev;
    }

    public void setNext(Node other) {

    }

    public void setPrev(Node other) {

    }

    public Integer getData() {

    }

    public Integer setData(Integer i) {

    }

    public String toString() {

    }
  }

  private int length;
  private Node start,end;

  public MyLinkedList() {
    List data1 = new List();
  }

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
