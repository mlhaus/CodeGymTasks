package en.codegym.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node(); // see red node
    private Node last = new Node(); // see blue node

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null && currentElement.value != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
//        1) instantiate a new node
        Node newNode= new Node();
//        2) assign the value
        newNode.value = value; 
//        3) get a reference of the last node's prev value
        Node lastPrev = last.prev;
//        4) assign that reference to the new node's prev value
        newNode.prev = lastPrev;
//        5) set the last node's prev value to the new node
        last.prev = newNode;  // DONE
//        7) assign the new node to the second to last node's next node
        lastPrev.next = newNode;  // DONE
//        8) assign the new node's next node to the last node
        newNode.next = last;  // DONE
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
