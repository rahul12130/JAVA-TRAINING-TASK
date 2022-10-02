class Node {
    int data;
    Node next;
};

class LinkedList {
    Node head;

    LinkedList(){
        head = null;
    }

    //Add new element at the end of the list
    void add(int newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node temp = new Node();
            temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    //Delete an element at the given position
    void remove_at(int position) {
        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1 && head != null) {
            Node nodeToremove = head;
            head = head.next;
            nodeToremove = null;
        } else {
            Node temp = new Node();
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }
            if(temp != null && temp.next != null) {
                Node nodeToremove = temp.next;
                temp.next = temp.next.next;
                nodeToremove = null;
            } else {
                System.out.print("\nThe node is already null.");
            }
        }
    }

    //display the content of the list
    void Display() {
        Node temp = new Node();
        temp = this.head;
        if(temp != null) {
            System.out.print("The list contains the Elements: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is no Elements.");
        }
    }
};
public class RemoveoneLinkedList {
    public static void main(String[] args) {
        LinkedList ML = new LinkedList();
        
        ML.add(10);
        ML.add(20);
        ML.add(30);
        ML.add(40);
        ML.add(50);
        ML.add(60);
        
        ML.Display();
        ML.remove_at(2);
        ML.Display();
    }
}