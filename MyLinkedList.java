import java.util.List;

public class MyLinkedList{
  private class Node{
    private Integer data;
    private Node next,prev;
    
    public Node() {   
	data = 0;    
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
	next = other;
    }

    public void setPrev(Node other) {
	prev = other;
    }

    public Integer getData() {
	return data;
    }

    public Integer setData(Integer i) {
	data = i;
    }

    public String toString() {
	return "" + data;
    }
  }

  private int length;
  private Node start,end;

  public MyLinkedList() {
    length = 0;
    start = new Node();
    end = new Node();
  }

  public int size() {
    return length;
  }

  public boolean add(Integer value) {
    Node add = new Node();
    add.setData(value);
    end.setNext(add); //what exceptions?
    return true;
    
  }

  public String toString() {
    return "";
  }

  private void nthNode() {
    //Node current = first_node;
    //while (current != null) {
      //System.out.println(current.value());
      //current = current.next();
    }
  }

  public Integer get(int index) {
    return 0;
  }

  public Integer set(int index,Integer value) {
    return 0;
  }

  public boolean contains(Integer value) {
    return true;
  }

  public int indexOf(Integer value) {
    return 0;
  }

  public void add(int index,Integer value) {

  }

  public Integer remove(int index) {
    return 0;
  }

  public boolean remove(Integer value) {//indexOf() would also be useful
    return true;
  } 
}
