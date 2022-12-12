class Node
{
    int data;
    //obj created
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class MylinkedList
{
    Node add(int data)
    {
        Node newnode=new Node(data);
        return newnode;
    }


    //this is to Display last value by taking first node address
    int findLastdata(Node n)
    {
        while(n.next!=null)
        {
            n=n.next;
        }
        return n.data;
    }
}

class Collection
{

    public static void main(String[] args)
    {
        MylinkedList obj1 = new MylinkedList();

        //reference to the objects
        Node n1= obj1.add(5);
        Node n2=obj1.add(6);
        Node n3=obj1.add(7);
        Node n4=obj1.add(8);
        Node n5=obj1.add(9);
        Node n6=obj1.add(10);

        //Linking nodes
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        int N;
        N= n3.next.next.data;
        System.out.println(N);

        //this is to Display last value by taking first node address
        int Lastvalue =obj1.findLastdata(n3);
        System.out.println(Lastvalue);
    }
}
