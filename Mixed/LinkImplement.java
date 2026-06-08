public class LinkImplement {
    // Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with essential functions
class LinkedList {
    Node head;

    // 1. Append - Add a node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // 2. Prepend - Add a node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 3. Insert After - Insert a new node after a specific node
    public void insertAfter(int key, int data) {
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // 4. Delete - Delete the first occurrence of a specific value
    public void delete(int key) {
        if (head == null) return;

        // If the node to be deleted is the head
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // 5. Find - Search for a node with a specific value
    
    public boolean find(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 6. Length - Get the number of nodes in the list

    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // 7. Reverse - Reverse the linked list
    

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    // 8. Display - Print all elements in the linked list

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 9. Delete at Position - Delete node at a specific position

    public void deleteAtPosition(int position) {
        if (head == null) return;
        Node current = head;
        if (position == 0) {
            head = current.next;
            return;
        }
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) return;
        current.next = current.next.next;
    }

    // 10. Get Nth Node - Retrieve data of the node at a specific index
    // Returns -1 if index is out of range

    
    public int getNthNode(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1; 
    }
}

}
