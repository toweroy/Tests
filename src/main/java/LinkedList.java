public class LinkedList {

    private int size;
    private Node first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;
        size++;
    }

    public Node delete() {
        Node temp = first;
        first = first.next;
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node currentNode = first;
        System.out.print("List: ");
        while(currentNode != null) {
            System.out.print(currentNode.getValue());
            currentNode = currentNode.next;
        }
        System.out.println("");
    }

    class Node {
        private int val;
        private Node next;

        Node(int input) {
            val = input;
        }

        public int getValue() {
            return val;
        }
    }
}
