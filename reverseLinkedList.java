public class reverseLinkedList {
    class Node{
        Node next;
        int val;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirts(int elem)
    {
        Node nn = new Node();
        nn.val=elem;
        if(head==null)
        {
            head=nn;
            tail=nn;
            size++;
        }
        else
        {
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("Size "+size);
    }
    public void reverseLinkl()
    {
        Node previousHead=null;
        while(head!=null)
        {
            Node nextAdd=head.next;
            head.next=previousHead;
            previousHead=head;
            head=nextAdd;
        }
        head=previousHead;
    }
    public static void main(String[] args) {
        reverseLinkedList ll= new reverseLinkedList();
        ll.addFirts(4);
        ll.addFirts(5);
        ll.addFirts(6);
        ll.addFirts(7);
        ll.addFirts(8);
        ll.addFirts(9);
        ll.addFirts(1);
        ll.display();
        ll.reverseLinkl();
        ll.display();
    }
}
