//Custom linkedlist
class Node {
  int data;
  Node previous, next;

  public Node(int data) {
    this.data = data;
    this.previous = null;
    this.next = null;
  }
}

public class DoubleEmpty {
  private Node head;
  private Node tail;

  public DoubleEmpty() {
    this.head = null;
    this.tail = null;
  }

  public void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.previous = tail;
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void displayForward() {
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DoubleEmpty myList = new DoubleEmpty();

    // Inserting elements into the list
    myList.insert(10);
    myList.insert(221);
    myList.insert(306);
    myList.insert(408);

    // Displaying the list in forward direction
    myList.displayForward();
  }
}