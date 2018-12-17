import java.util.List;

public class MyLinkedList{
  private class Node{
    private Integer data;
    private Node next,prev;
    
    public Node() {   
	data = 0;    
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
	return data;
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
    if (length == 0) {
      start.setData(value); //if list is empty, then adding a node would mean start and end node would be equal to value
      end.setData(value);
    }
    else { //otherwise one must create a new node and set the end reference to it (essentially adding it on)
      Node add = new Node();
      add.setData(value);
      end.setNext(add); 
      end = add; //the added node would be the new end
    }
    length = length + 1;
    return true;
  }

  public String toString() {
    Node current = new Node(); 
    current = start;
    String str = "[" + current.getData();
    for (int a = 0; a < (size() - 1); a++) {
      current = current.next();
      str = str + current.getData();
    }
    if (size() == 0) {
      return "[]";
    }
    return str + "]";
  }

  private Node nthNode(int index) {
    Node current = new Node(); 
    current = start;
    for (int a = 0; a < index; a++) {
      current = current.next(); //get the next node until you have reached the node of the specified index
    }
    return current;
  }

  public Integer get(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException(); //if the index is out of range
    }
    else {
      return nthNode(index).getData(); //Returns the element at the specified position in this list
    }
  }

  public Integer set(int index,Integer value) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException(); //if the index is out of range
    }
    else {
      Integer hold = nthNode(index).getData();
      nthNode(index).setData(value); //Replaces the element at the specified position in this list with the specified element
      return hold; //the element previously at the specified position
    }
  }

  public boolean contains(Integer value) {
    Node current = new Node(); 
    current = start;
    if (current.getData().equals(value)) {
      return true;
    }
    for (int a = 0; a < (size() - 1); a++) {
      current = current.next();
      if (current.getData().equals(value)) {
        return true; //Returns true if this list contains the specified element
      }
    }
    return false;
  }

  public int indexOf(Integer value) {
    Node current = new Node(); 
    current = start;
    if (current.getData().equals(value)) {
      return 0;
    }
    for (int a = 0; a < (size() - 1); a++) {
      current = current.next();
      if (current.getData().equals(value)) {
        return (a + 1); // Returns the index of the first occurrence of the specified element in this list
      }
    }
    return -1; //returns -1 if this list does not contain the element
  }

  public void add(int index,Integer value) {
    Node add = new Node();
    add.setData(value);
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException(); //if the index is out of range
    }
    else {
      if (index == 0) {
        start.setPrev(add);
        add.setNext(start);
        start = add;
      }
      else {
        nthNode(index).setPrev(add);
        nthNode(index - 1).setNext(add); //Inserts the specified element at the specified position in this list
      }
      length = length + 1;
    }
  }

  public Integer remove(int index) {
    Integer hold = nthNode(index).getData();
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException(); //if the index is out of range
    }
    else {
      if (size() == 1) { //if only one element
        start = new Node();
      }
      if (index == (size() - 1)) {//if you want to remove the last element
        end = end.prev();
      }
      else {
        nthNode(index + 1).setPrev(nthNode(index - 1));
        nthNode(index - 1).setNext(nthNode(index + 1)); //Removes the element at the specified position in this list
      }
      length = length - 1;
    }
    return hold;
  }

  public boolean remove(Integer value) {//indexOf() would also be useful
    int idx = 0;
    if (indexOf(value) == -1) {
      return false; //If this list does not contain the element, the list is unchanged
    }
    else {
      idx = indexOf(value); 
      remove(idx); //Removes the first occurrence of the specified element from this list, if it is present
      return true; //true if this list contained the specified element
    }
  } 
}
