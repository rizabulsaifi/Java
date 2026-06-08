

public class implement {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedList {
        Node head = null;
        Node tail = null;

        void deleteAt(int idx){
            if(idx==0) {
                head = head.next;
                return;
            }
            Node temp = head;
            for(int i = 1; i <= idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            // if(idx==size()-1){
                tail=temp;
            // }
        }
        void insertAt(int idx,int val){
            if(idx==size()){
                insertAtEnd(val);
            } else if(idx==0){
                InsertAtHead(val);
                return;
            } else if(idx<0 || idx > size()){
                System.out.println("Wrong Index ! ");
            }
            Node t = new Node(val);
            Node temp = head;
            for(int i = 1; i<= idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx){
            if(idx<0 || idx > size()){
                System.out.println("Wrong Index ! ");
                return 0;
            }
            Node temp = head;
            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        void InsertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                // insertAtEnd(val);
                head = tail =temp;
            } else{
                temp.next = head;
                head = temp;
            }
            
        }
        void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        void reverse(Node head) {
            if (head == null) {
                return;
            }
            reverse(head.next);
            System.out.print(head.data + " ");
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.print("Enter size of LinkedList : ");
        //     int s = sc.nextInt();
        //     System.out.print("Enter " + s + " Element in LinkedList : ");
        //     for (int i = 1; i <= s; i++) {
        //         int val = sc.nextInt();
        //         ll.insertAtEnd(val);
        //     }
        // }
        ll.InsertAtHead(100); // 100 
        // ll.display(ll.head);
        ll.insertAtEnd(5); // 100 -> 5
        // ll.display(ll.head);
        ll.insertAtEnd(8); // 100 -> 5 -> 8
        // ll.display(ll.head);
        ll.insertAtEnd(2); // 100 -> 5 -> 8 -> 2
        // ll.display(ll.head);
        ll.insertAtEnd(15); // 100 -> 5 -> 8 -> 2 -> 15
        // ll.display(ll.head);
        ll.insertAtEnd(18); // 100 -> 5 -> 8 -> 2 -> 15 -> 18
        // ll.display(ll.head);
        ll.insertAtEnd(12); // 100 -> 5 -> 8 -> 2 -> 15 -> 18 -> 12
        // ll.display(ll.head);
        ll.InsertAtHead(55); // 55 -> 100 -> 5 -> 8 -> 2 -> 15 -> 18 -> 12
        // ll.display(ll.head);
        ll.insertAt(0, 74); // 74 -> 55 -> 100 -> 5 -> 8 -> 2 -> 15 -> 18 -> 12
        System.out.print("Element of LinkedList : ");
        ll.display(ll.head);
        System.out.println();
        System.out.print("Size of LinkedList : "+ll.size());
        System.out.println();
        // System.out.print("Reverse LinkedLink : ");
        // ll.reverse(ll.head);
        // ll.display(ll.head);
        // System.out.println(ll.tail.data);
        // System.out.println(ll.head.data);
        System.out.println("Get : "+ll.getAt(3));
        ll.deleteAt(0);
        ll.display(ll.head);
        System.out.println("Size of LinkedList : "+ll.size());
        System.out.println("Data : "+ll.tail.data);
        ll.reverse(ll.head);
        ll.display(ll.head);
    }
}