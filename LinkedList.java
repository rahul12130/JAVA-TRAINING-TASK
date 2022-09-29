 class Linkedlist {

    Node top;
    static class Node {
        int data;
        Node next;
        // Constructor
        Node(int data)
        {
           this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node
    public static Linkedlist add(Linkedlist list1, int data)
    {
        // Create a new node with given data
        Node n_node = new Node(data);
        if (list1.top == null) {
            list1.top = n_node;
        }
        else {
            Node last = list1.top;
            while (last.next != null) {
                last = last.next;
            }
            last.next = n_node;
        }
        return list1;
    }

    // Method to print the Linkedlist1.
   public static  void printlist1(Linkedlist list1)
    {
        Node currentNode = list1.top;

        System.out.print("Linkedlist: ");
        while (currentNode != null) {

            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args)
    {
        Linkedlist list1 = new Linkedlist();
        list1 =add(list1, 101);
        list1 = add(list1, 102);
        list1 = add(list1, 103);
        list1 = add(list1, 104);
        list1 = add(list1, 105);
        list1 = add(list1, 106);
        list1 = add(list1, 107);
        list1 = add(list1, 108);
        list1 = add(list1, 109);
        list1 = add(list1, 1010);

        printlist1(list1);
    }
}