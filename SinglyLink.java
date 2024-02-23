import java.util.LinkedList;

class singlyLink {
  public static void main(String[] args) {
    LinkedList<Integer> single = new LinkedList<>();
    single.add(34);
    single.add(456);
    single.add(123);
    System.out.println("Elements before manipulation " + single);
    single.addFirst(97);
    single.addLast(40);
    single.add(238);
    single.add(57);
    System.out.println("Element at index 4 is " + single.get(4));

    for (int x : single) {
      System.out.println("Element: " + x + ", Address: " + System.identityHashCode(x));
    }
    System.out.println("The size of the linkedlist is: " + single.size());
  }
}