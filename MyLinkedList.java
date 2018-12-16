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
	String str = "";
	for (int a = 0; 
    }
  }

  private int length;
  private Node start,end;

  public MyLinkedList() {
    List data1 = new List();
    start = new Node();
    end = new Node();
  }

  public int size() {
    return length;
  }

  public boolean add(Integer value) {

  }

  public String toString() {

  }

  public Integer get(int index) {

  }

  public Integer set(int index,Integer value) {

  }

  public boolean contains(Integer value) {

  }

  public int indexOf(Integer value) {

  }

  public void add(int index,Integer value) {

  }

  public Integer remove(int index) {

  }

  public boolean remove(Integer value) {//indexOf() would also be useful

  } 
}
