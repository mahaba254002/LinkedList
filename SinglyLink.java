import java.util.LinkedList;

class singlyLink {
  public static void main(String[] args) {
    LinkedList<Integer> single = new LinkedList<>();
    single.add(34);
    single.add(456);
    single.add(123);
    System.out.println("Elements before manipulation " + single);
    single.addFirst(9769457);
    single.addLast(407608);
    single.add(238);
    single.add(0457);
    System.out.println("Element at index 4 is " + single.get(4));

    for (int x : single) {
      System.out.println("Element: " + x + ", Address: " + System.identityHashCode(x));
    }
    System.out.println("The size of the linkedlist is: " + single.size());
  }
}