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

    //delete all nodes of the list
    void removeAllNodes() {
        Node temp = new Node();
        while(this.head != null) {
            temp = this.head;
            this.head = this.head.next;
            temp = null;
        }
        System.out.println("All nodes are removed successfully.");
    }

    //display the content of the list
    void DisplayList() {
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
            System.out.println("The list is No Elements.");
        }
    }
};
public class RemoveallLinkedList{
    public static void main(String[] args) {
        LinkedList ML = new LinkedList();
        ML.add(10);
        ML.add(20);
        ML.add(30);
        ML.add(40);
        ML.DisplayList();
        ML.removeAllNodes();
        ML.DisplayList();
    }
}