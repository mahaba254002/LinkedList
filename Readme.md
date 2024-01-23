# LinkedList
- LinkedList in java is a dynamic data structure consisting of a sequence of nodes, where each node contains a reference to the next node in the list and whose size increases as you add the elements and decreases as you remove the elements from the list.

## Features of LinkedList
- Dynamic Size: LinkedList has a dynamic size, which means it can grow or shrink as elements are added or removed. Unlike arrays, which have a fixed size, LinkedList can adjust its size dynamically based on the number of elements in the list.

- Efficient Insertion and Deletion: LinkedList provides efficient insertion and deletion operations. Adding or removing an element at the beginning or end of the list can be done in constant time complexity (O(1)) since it only requires updating a few references. However, inserting or removing an element at an arbitrary position in the list takes linear time complexity (O(n)) because it requires traversing the list to find the desired position.

- Implementation of List Interface: LinkedList implements the List interface in Java, which means it provides all the methods defined by the List interface. These methods include adding elements, removing elements, accessing elements by index, searching for elements, and more.

- Doubly Linked: LinkedList in Java is implemented as a doubly-linked list. Each node in the list contains references to both the previous node and the next node. This allows for efficient traversal in both forward and backward directions.

- No Random Access: Unlike arrays, LinkedList does not provide direct random access to elements. To access an element at a specific position, you must traverse the list from the beginning or end, which takes linear time complexity (O(n)). If random access is a frequent requirement, an ArrayList might be a more suitable choice.

- Memory Efficiency: LinkedList requires additional memory to store the references to the next and previous nodes. This overhead can be larger compared to arrays or ArrayList, where elements are stored in contiguous memory locations. However, LinkedList can be more memory-efficient than ArrayList when the number of elements is small or when frequent insertions and deletions are required.

- Iteration and Iterators: LinkedList provides efficient iteration over its elements using iterators or enhanced for-each loops. Iterators allow you to traverse the list in a forward direction and perform various operations on the elements.

- Not Synchronized: LinkedList is not synchronized, which means it is not thread-safe by default. If you need to use a LinkedList in a multithreaded environment, you should consider synchronizing access to the list externally or using the synchronized collections provided in the java.util.concurrent package.


**Use an ArrayList for storing and accessing data, and LinkedList to manipulate data**

### Types of LinkedLists
 - *Singly LinkedList*
 - *Double LinkedList*
 - *Circular LinkedList*

 - When inserting a new node into a doubly linked list, you have two cases to consider. If the list is empty, **the new node becomes both the head and tail of the list**. If the list is not empty, you update the references of the new node, the current tail, and the tail itself to maintain the linking order.

 ### Use cases of LinkedList
 #### Double
 - Undo-Redo Functionality: Doubly linked lists are often used to implement undo-redo functionality in applications. Each action or state change can be stored as a node in the doubly linked list. The next link allows for redoing actions, while the previous link allows for undoing actions by traversing backward in the list.

 - Browser History: Web browsers typically use doubly linked lists to manage the browsing history. Each visited webpage is stored as a node in the list. The next link allows for moving forward in the history to visit the next webpage, while the previous link allows for moving backward to revisit previously visited pages.