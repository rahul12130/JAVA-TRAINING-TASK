 class LinkedList {

    Node head;
    static class Node {
        int data;
        Node next;
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    // Method to print the LinkedList.
   public static  void printList(LinkedList list)
    {
        Node currentNode = list.head;

        System.out.print("LinkedList: ");
        while (currentNode != null) {

            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list = insert(list, 101);
        list = insert(list, 102);
        list = insert(list, 103);
        list = insert(list, 104);
        list = insert(list, 105);
        list = insert(list, 106);
        list = insert(list, 107);
        list = insert(list, 108);
        list = insert(list, 109);
        list = insert(list, 1010);

        printList(list);
    }
}