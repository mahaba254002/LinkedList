class Node {
  int data;
  Node previous;
  Node next;

  public Node(int data) {
    this.data = data;
    this.previous = null;
    this.next = null;
  }
}


public class Inserting {
  private Node head;
  private Node tail;

  public Inserting() {
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

  public void insertAtIndex(int index, int data) {
    if (index < 0) {
      System.out.println("Invalid index");
      return;
    }

    Node newNode = new Node(data);

    if (head == null) {
      if (index == 0) {
        head = newNode;
        tail = newNode;
      } else {
        System.out.println("Invalid index");
      }
      return;
    }

    if (index == 0) {
      newNode.next = head;
      head.previous = newNode;
      head = newNode;
    } else {
      Node currentNode = head;
      int currentIndex = 0;

      while (currentNode != null && currentIndex < index - 1) {
        currentNode = currentNode.next;
        currentIndex++;
      }

      if (currentNode == null) {
        System.out.println("Invalid index");
        return;
      }

      newNode.next = currentNode.next;
      newNode.previous = currentNode;
      if (currentNode.next != null) {
        currentNode.next.previous = newNode;
      }
      currentNode.next = newNode;

      if (newNode.next == null) {
        tail = newNode;
      }
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
    Inserting myList = new Inserting();

    myList.insert(10);
    myList.insert(20);
    myList.insert(30);
    myList.insert(40);

    myList.insertAtIndex(2, 25);  // Inserting 25 at index 2

    myList.displayForward();
  }
}